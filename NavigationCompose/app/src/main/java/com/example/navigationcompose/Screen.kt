package com.example.navigationcompose

sealed class Screen( //by default every constructor will be private (doesnt allow inherit)
    val route: String
) {
    object Home: Screen(route = "home_screen")
    object Detail: Screen(route = "detail_screen")
}
