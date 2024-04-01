package com.example.navparcelableobject.screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.core.app.Person
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    var person by mutableStateOf<Person?>(null)
        private set

    fun addPerson(newPerson: Person){
        person = newPerson
    }
}