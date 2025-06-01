package com.example.routes

import io.ktor.http.HttpStatusCode
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get

fun Route.root() {
    get(path = "/") {
        val message = "Welcome User"
        println("Anime: message = $message ${HttpStatusCode.OK}")
        call.respond(
            message = message,
            status = HttpStatusCode.OK
        )
    }
}