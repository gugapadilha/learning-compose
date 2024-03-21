package com.example.navparcelableobject

sealed class Screen(val route: String) {
    object Home: Screen("home")
    object Details: Screen("details")
}