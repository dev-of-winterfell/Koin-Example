package com.example.koinexample.utils

import com.example.koinexample.data.model.User

sealed class UserUiState {
    object Loading : UserUiState()
    data class Scuccess(val users: List<User>) : UserUiState()
    data class Error(val message: String) : UserUiState()

}