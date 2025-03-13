package com.example.koinexample.ui.screen.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.koinexample.data.model.User

@Composable
fun UserList(users: List<User>) {
    LazyColumn (modifier = Modifier
        .fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ){
        items(users) { user ->
            UserItem(user = user)
            Divider()
        }
    }
}