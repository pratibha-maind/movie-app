package com.example.mymovies.Services

import com.example.mymovies.client.DomainOpenApiClient
import com.example.mymovies.mapper.UserMapper
import com.example.mymovies.model.RandomUser
import okhttp3.ResponseBody
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.stereotype.Service
import java.util.logging.Logger

@Service
class RandomUserService {

    @Autowired
    private val domainClient = DomainOpenApiClient()
    @Autowired
    private val userMapper = UserMapper()

    fun getRandomUser(): RandomUser {
        val response = domainClient.fetchRandomUser() ?: throw NotFoundException()
        logger.info("this is respinsee----- ${response.toString()}")
        return userMapper.mapUserResponse(response.string())
    }

    companion object{
        val logger = Logger.getLogger("logger")
    }
}