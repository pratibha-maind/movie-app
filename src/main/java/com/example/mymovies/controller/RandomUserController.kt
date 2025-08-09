package com.example.mymovies.controller

import com.example.mymovies.Services.RandomUserService
import com.example.mymovies.model.RandomUser
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RandomUserController {

    @Autowired
    private val randomUserService = RandomUserService()

    @GetMapping(path = ["/random-user"])
    fun getRandomUserInfo(): RandomUser {
        return randomUserService.getRandomUser()
    }
}