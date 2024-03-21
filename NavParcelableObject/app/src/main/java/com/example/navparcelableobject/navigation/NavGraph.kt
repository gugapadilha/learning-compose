package com.example.navparcelableobject.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navparcelableobject.Screen
import com.example.navparcelableobject.data.Person
import com.example.navparcelableobject.screen.details.DetailScreen
import com.example.navparcelableobject.screen.home.HomeScreen

@Composable
fun SetupNavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
    ){
        composable(route = Screen.Home.route){
            HomeScreen(navController = navController)
        }
        composable(route = Screen.Details.route){
            LaunchedEffect(key1 = it){
                val result =
                    navController.previousBackStackEntry?.savedStateHandle?.get<Person>("person") //receiving
                Log.d("DetailScreen", "${result?.firstName}")
                Log.d("DetailScreen", "${result?.lastName}")
            }
            DetailScreen(navController = navController)
        }
    }

}