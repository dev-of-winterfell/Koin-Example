package com.example.koinexample.data.api

import com.example.koinexample.data.model.User
import retrofit2.Response
import retrofit2.http.GET

interface UserApi {
    @GET("users")
    suspend fun getUsers(): Response<List<User>>

}