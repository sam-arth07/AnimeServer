package com.example

import com.example.di.koinModule
import com.example.models.ApiResponse
import com.example.repository.HeroRepository
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.ktor.http.HttpStatusCode
import io.ktor.server.testing.testApplication
import kotlinx.serialization.json.Json
import org.junit.After
import org.junit.Before
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.context.GlobalContext.stopKoin
import org.koin.java.KoinJavaComponent.inject
import kotlin.test.Test
import kotlin.test.assertEquals

class ApplicationTest {
    private val heroRepository: HeroRepository by inject(HeroRepository::class.java)


    @Test
    fun `access root endpoint, assert correct information`() = testApplication {
        application {
            module()
        }
        client.get("/").apply {
            assertEquals(expected = HttpStatusCode.OK, actual = status)
            assertEquals(expected = "Welcome User", actual = bodyAsText())
        }
    }

    @Before
    fun startKoinForTest() {
        startKoin {
            modules(koinModule)
        }
    }

    @Test
    fun `access all heroes endpoint, query all pages, assert correct information`() =
        testApplication {
            application {
                module()
            }
            val heroes = listOf(
                heroRepository.page1,
                heroRepository.page2,
                heroRepository.page3,
                heroRepository.page4,
                heroRepository.page5
            )
            val pages = heroRepository.heroes.keys.toList()

            pages.forEach { page ->
                client.get("/anime/heroes?page=$page").apply {
                    assertEquals(expected = HttpStatusCode.OK, actual = status)
                    val expected = ApiResponse(
                        success = true,
                        message = "Ok",
                        prevPage = calculatePage(page)["PREV_PAGE_KEY"],
                        nextPage = calculatePage(page)["NEXT_PAGE_KEY"],
                        heroes = heroes[page - 1]
                    )
                    val actual = Json.decodeFromString<ApiResponse>(bodyAsText())
                    println("Expected: $expected")
                    println("Actual: $actual")
                    assertEquals(expected = expected, actual = actual)
                }
            }
        }


    private fun calculatePage(page: Int): Map<String, Int?> {
        var prevPage: Int? = null
        var nextPage: Int? = null

        if (page in 1..4) {
            nextPage = page.plus(1)
        }
        if (page in 2..5) {
            prevPage = page.minus(1)
        }
        return mapOf("PREV_PAGE_KEY" to prevPage, "NEXT_PAGE_KEY" to nextPage)
    }

    @Test
    fun `access all heroes endpoint, query invalid text ,assert error`() = testApplication {
        application {
            module()
        }

        client.get("/anime/heroes?page=invalid").apply {
            assertEquals(expected = HttpStatusCode.BadRequest, actual = status)
            val expected = ApiResponse(
                success = false,
                message = "Only number allowed.",
            )
            val actual = Json.decodeFromString<ApiResponse>(bodyAsText())
            println("Expected: $expected")
            println("Actual: $actual")
            assertEquals(expected = expected, actual = actual)
        }

    }

    @Test
    fun `access all heroes endpoint, heroes not found, assert error`() = testApplication {
        application {
            module()
        }

        client.get("/anime/heroes?page=6").apply {
            println("page: 6")
            assertEquals(expected = HttpStatusCode.NotFound, actual = status)
            val expected = ApiResponse(
                success = false,
                message = "404: Page Not Found",
            )
            val actual = Json.decodeFromString<ApiResponse>(bodyAsText())
            println("Expected: $expected")
            println("Actual: $actual")
            assertEquals(expected = expected, actual = actual)
        }
    }

    @Test
    fun `access search heroes endpoint, query hero name, assert single hero result`() =
        testApplication {
            application {
                module()
            }

            client.get("/anime/heroes/search?name=nar").apply {
                assertEquals(expected = HttpStatusCode.OK, actual = status)
                val actual = Json.decodeFromString<ApiResponse>(bodyAsText()).heroes.size
                println("Actual: $actual")
                println("Actual Content: ${Json.decodeFromString<ApiResponse>(bodyAsText())}")
                assertEquals(
                    expected = 1,
                    actual = actual
                )
            }

        }

    @Test
    fun `access search heroes endpoint, query hero name, assert multiple hero result`() =
        testApplication {
            application {
                module()
            }

            client.get("/anime/heroes/search?name=sa").apply {
                assertEquals(expected = HttpStatusCode.OK, actual = status)
                val actual = Json.decodeFromString<ApiResponse>(bodyAsText()).heroes.size

                println("Actual: $actual")
                println("Actual Content: ${Json.decodeFromString<ApiResponse>(bodyAsText())}")
                assertEquals(
                    expected = 3,
                    actual = actual
                )
            }

        }

    @Test
    fun `access search heroes endpoint, query empty hero name, assert empty list as result`() =
        testApplication {
            application { module() }
            client.get("/anime/heroes/search?name=").apply {
                assertEquals(expected = HttpStatusCode.OK, actual = status)
                val actual = Json.decodeFromString<ApiResponse>(bodyAsText()).heroes
                assertEquals(
                    expected = emptyList(),
                    actual = actual
                )
            }

        }

    @Test
    fun `access search heroes endpoint, query non existing hero , assert empty list as a result`() =
        testApplication {
            application { module() }
            client.get("/anime/heroes/search?name=invalid").apply {
                assertEquals(
                    expected = HttpStatusCode.OK,
                    actual = status
                )
                val actual = Json.decodeFromString<ApiResponse>(bodyAsText()).heroes
                assertEquals(
                    expected = emptyList(),
                    actual = actual
                )
            }
        }

    @Test
    fun `access unknown endpoint, assert not found result`() = testApplication {
        application { module() }
        client.get("/heroes").apply {
            assertEquals(
                expected = HttpStatusCode.NotFound,
                actual = status
            )
            val expected = ApiResponse(
                message = "404: Page Not Found",
                success = false
            )
            val actual = Json.decodeFromString<ApiResponse>(bodyAsText())
            assertEquals(
                expected = expected,
                actual = actual
            )
        }
    }

    @After
    fun stopKoinAfterTest() = stopKoin()
}
