package com.example.paging3app.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class User(
    @SerialName("links")
    val userLinks: UserLinks,
    val username: String
)
