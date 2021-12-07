package com.memes.data.model

import kotlinx.serialization.Serializable

@Serializable
data class ResponseWrapper <T> (val data: T?)
