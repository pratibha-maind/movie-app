package com.example.mymovies.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class RandomUser(
    val results :List<User>
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class User(
    @JsonProperty("name")
    val fullName: FullName,

    val email: String,
    )

@JsonIgnoreProperties(ignoreUnknown = true)
data class FullName(
    val title: String,

    @JsonProperty("first")
    val firstName: String,

    @JsonProperty("last")
    val lastName: String
)
