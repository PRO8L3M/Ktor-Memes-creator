package com.memes.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Meme(
    val id: Long,
    val name: String,
    val tags: List<String>,
    val imageUrl: String
)
