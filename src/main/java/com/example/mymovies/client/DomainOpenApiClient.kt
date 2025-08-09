package com.example.mymovies.client

import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.ResponseBody
import org.springframework.stereotype.Component

@Component
class DomainOpenApiClient(
    val okHttpClient: OkHttpClient = OkHttpClient()
) {

    fun fetchCatDataFromOpenApi(): String {
        val request = Request.Builder()
            .url("https://catfact.ninja/fact")
            .get()
            .build()

        val call = okHttpClient.newCall(request)
        val response = call.execute()

        if(!response.isSuccessful){
            throw Exception()
        }
        return response.body.string() ?: "Empty Body";
    }

    fun fetchRandomUser(): ResponseBody{
        val request = Request.Builder()
            .url("https://randomuser.me/api/")
            .get()
            .build()

        val response = okHttpClient.newCall(request).execute()
        if(!response.isSuccessful){
            throw Exception()
        }
        return response.body
    }
}