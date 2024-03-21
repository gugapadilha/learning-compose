package com.example.navparcelableobject.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navparcelableobject.Screen
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
            DetailScreen(navController = navController)
        }
    }

}