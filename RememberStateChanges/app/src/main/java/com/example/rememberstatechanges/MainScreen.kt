package com.example.rememberstatechanges

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

data class Person(
    val name: String,
    val age: Int
)

@Composable
fun MainScreen() {
    var person by remember {
        mutableStateOf(Person("Guga", 22))
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hi, my name is ${person.name}. I'm ${person.age} years old")
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = { person = Person(name = "Stefan", age = 30) }
        ) {
            Text(text = "Update")
        }
    }
}