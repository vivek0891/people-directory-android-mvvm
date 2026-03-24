package com.example.peopleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.peopleapp.presentation.ui.UserListScreen
import com.example.peopleapp.presentation.viewmodel.UserViewModel
import com.example.peopleapp.ui.theme.PeopleAppTheme

class MainActivity : ComponentActivity() {

    private val viewModel = UserViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PeopleAppTheme {
                UserListScreen(viewModel = viewModel)
            }
        }
    }
}