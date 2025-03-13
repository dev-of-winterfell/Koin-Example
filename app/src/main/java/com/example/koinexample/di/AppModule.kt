package com.example.koinexample.di

import com.example.koinexample.data.api.UserApi
import com.example.koinexample.data.repository.UserRepository
import com.example.koinexample.ui.viewmodel.UserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModule =
    module {
        single {
            Retrofit
                .Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(UserApi::class.java)
        }

        factory { UserRepository(get()) }

        viewModel { UserViewModel(get()) }
    }
