package com.example.navparcelableobject.screen.details

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.navparcelableobject.Screen
import com.example.navparcelableobject.data.Person
import com.example.navparcelableobject.screen.SharedViewModel

@Composable
fun DetailScreen(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {

    val person = sharedViewModel.person
    LaunchedEffect(key1 = person ){
        if (person != null){
            Log.d("DetailScreen", person.firstName)
            Log.d("DetailScreen", person.lastName)
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .clickable {
                val person = Person("John", "Doe")
                sharedViewModel.addPerson(newPerson = person)
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
    val sharedViewModel = SharedViewModel()
    DetailScreen(navController = navController, sharedViewModel)
}