package com.example.navigationcompose

const val DETAIL_ARGUMENT_KEY = "id"
sealed class Screen( //by default every constructor will be private (doesnt allow inherit)
    val route: String
) {
    object Home: Screen(route = "home_screen")
    object Detail: Screen(route = "detail_screen/{$DETAIL_ARGUMENT_KEY}"){
        fun passId(id: Int) : String {
            return "detail_screen/$id" //passing Single Required Argument function to HomeScreen
        }
    }
}
