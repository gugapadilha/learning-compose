package com.example.navparcelableobject.screen.details

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.navparcelableobject.Screen
import com.example.navparcelableobject.data.Person

@Composable
fun DetailScreen(
    navController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .clickable {
                val person = Person("John", "Doe")
                navController.currentBackStackEntry?.savedStateHandle?.set(
                    key = "person",
                    value = person
                )
                //navController.popBackStack() //WE navigate and remove our detail screen from the backstack
                navController.navigate(Screen.Home.route)
            },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Detail",
            style = TextStyle(
                fontSize = MaterialTheme.typography.displayLarge.fontSize,
                fontWeight = FontWeight.Bold
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DetailScreenPreview() {
    val navController = rememberNavController()
    DetailScreen(navController = navController)
}