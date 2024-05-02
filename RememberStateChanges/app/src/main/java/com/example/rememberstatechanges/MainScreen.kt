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
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.SaverScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

data class Person(
    val name: String,
    val age: Int
)

//It possible save the state of screen using a view model or a savable state saver.
@Composable
fun MainScreen() {
    var person by rememberSaveable(stateSaver = PersonSaver) {
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

object PersonSaver : Saver<Person, Map<String, Any>> {
    override fun restore(value: Map<String, Any>): Person {
        val name = value["name"] as String
        val age = value["age"] as Int
        return Person(name, age)
    }

    override fun SaverScope.save(value: Person): Map<String, Any> {
        return mapOf(
            "name" to value.name,
            "age" to value.age
        )
    }

}