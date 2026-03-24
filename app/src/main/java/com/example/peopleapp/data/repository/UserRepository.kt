package com.example.peopleapp.data.repository

import com.example.peopleapp.core.network.RetrofitClient
import com.example.peopleapp.data.remote.toDomain
import com.example.peopleapp.domain.model.User

class UserRepository {

    suspend fun getUsers(): List<User> {
        return RetrofitClient.apiService.getUsers().map { it.toDomain() }
    }
}