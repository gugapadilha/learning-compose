package com.example.lazycolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import com.example.lazycolumn.repository.PersonRepository
import com.example.lazycolumn.ui.CustomItem
import com.example.lazycolumn.ui.theme.LazyColumnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumnTheme {
               val personRepository = PersonRepository()
                val getAllData = personRepository.getAllData()
                
                LazyColumn(){
                    items(items = getAllData){ person ->
                        CustomItem(person =  person)
                    }
                }
                }
            }
        }
    }

