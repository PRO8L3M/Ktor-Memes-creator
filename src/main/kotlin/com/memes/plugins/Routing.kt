package com.memes.plugins

import com.memes.routes.memes
import io.ktor.application.*
import io.ktor.http.content.*
import io.ktor.routing.*

fun Application.configureRouting() {

    routing {
        memes()
        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
