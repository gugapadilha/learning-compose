package com.example.lazycolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.unit.dp
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
                
                LazyColumn(
                    contentPadding = PaddingValues(all = 12.dp), //padding for all borders
                    verticalArrangement = Arrangement.spacedBy(12.dp) // spacing between every Person
                ){
                    items(items = getAllData){ person ->
                        CustomItem(person =  person)
                    }
                }
                }
            }
        }
    }

