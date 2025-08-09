package com.example.mymovies.mapper

import com.example.mymovies.model.RandomUser
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.springframework.stereotype.Component

@Component
class UserMapper {
    private val objectMapper = jacksonObjectMapper()

    fun mapUserResponse(response: String): RandomUser{
        return objectMapper.readValue<RandomUser>(response)
    }
}