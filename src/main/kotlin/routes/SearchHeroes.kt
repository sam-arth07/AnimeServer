package com.example.routes

import com.example.repository.HeroRepository
import io.ktor.http.HttpStatusCode
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.application
import io.ktor.server.routing.get
import org.koin.ktor.ext.inject

fun Route.searchHeroes() {
    val heroRepoImpl: HeroRepository by application.inject()
    get("/anime/heroes/search") {
        val name = call.request.queryParameters["name"]
        val apiResponse = heroRepoImpl.searchHeroes(name = name)
        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )
    }
}