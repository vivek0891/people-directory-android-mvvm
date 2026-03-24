package com.example.peopleapp.data.remote

import com.example.peopleapp.domain.model.User

fun UserResponse.toDomain(): User {
    return User(
        id = id,
        name = name,
        email = email
    )
}