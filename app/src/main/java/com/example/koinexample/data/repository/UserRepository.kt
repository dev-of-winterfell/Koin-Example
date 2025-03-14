package com.example.koinexample.data.repository

import com.example.koinexample.data.api.UserApi
import com.example.koinexample.data.model.User
import kotlinx.coroutines.delay


class UserRepository(private val api:UserApi) {
    suspend fun getUser():Result<List<User>>{
        delay(2000)
        val fakeUser= listOf(
            User(1, "alex", "alex@example.com"),
            User(2, "sophia", "sophia@example.com"),
            User(3, "marcus", "marcus@gmail.com"),
            User(4, "priya", "priya@outlook.com"),
            User(5, "jordan", "jordan@protonmail.com"),
            User(6, "elena", "elena@yahoo.com"),
            User(7, "kai", "kai@fastmail.com"),
            User(8, "zoe", "zoe@icloud.com"),
            User(9, "tyson", "tyson@gmail.com"),
            User(10, "maya", "maya@example.org")
        )
        return Result.success(fakeUser)
    }
}