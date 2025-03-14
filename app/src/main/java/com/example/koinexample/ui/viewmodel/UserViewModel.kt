package com.example.koinexample.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.koinexample.utils.UserUiState
import com.example.koinexample.data.repository.UserRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch


class UserViewModel(private val repository: UserRepository):ViewModel() {

    private val _uiState = MutableStateFlow<UserUiState>(UserUiState.Loading)
    val uiState: StateFlow<UserUiState> = _uiState

    init {
        LoadUsers()
    }

     fun LoadUsers() {
        _uiState.value = UserUiState.Loading
        viewModelScope.launch {
            repository.getUser().onSuccess { user ->
                _uiState.value = UserUiState.Scuccess(user)
            }
                .onFailure { error ->
                    _uiState.value = UserUiState.Error(error.message ?: "Unknown error")
                }
        }
    }
}