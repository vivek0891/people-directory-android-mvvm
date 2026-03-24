package com.example.peopleapp.core.network

import com.example.peopleapp.data.remote.UserResponse
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): List<UserResponse>
}