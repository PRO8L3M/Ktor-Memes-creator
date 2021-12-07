package com.memes.routes

import com.memes.data.mocks.Mocks
import com.memes.data.model.ResponseWrapper
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

const val BASE_URL = "http://192.168.0.144:8080"

fun Route.memes() {
    get("/memes") {
        call.respond(
            HttpStatusCode.OK,
            ResponseWrapper(data = Mocks.memes)
        )
    }
}


