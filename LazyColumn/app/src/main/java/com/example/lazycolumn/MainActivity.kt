package com.example.lazycolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lazycolumn.model.Person
import com.example.lazycolumn.repository.AnimeRepository
import com.example.lazycolumn.repository.PersonRepository
import com.example.lazycolumn.ui.AnimeListScreen
import com.example.lazycolumn.ui.CustomAnimeItem
import com.example.lazycolumn.ui.CustomItem
import com.example.lazycolumn.ui.CustomItem2
import com.example.lazycolumn.ui.theme.LazyColumnTheme
import java.lang.reflect.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumnTheme {
                AnimeListScreen()
            }
        }
    }
}
/*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumnTheme {
                val personRepository = PersonRepository()
                val getAllData = personRepository.getAllData()

                LazyColumn(
                    contentPadding = PaddingValues(all = 12.dp), //padding for all borders
                    verticalArrangement = Arrangement.spacedBy(12.dp) // spacing between every Person
                ) {
                    items(items = getAllData) { person ->
                        CustomItem(person = person)
                    }
                }
                /*LazyRow(
                    contentPadding = PaddingValues(all = 12.dp), //padding for all borders
                    horizontalArrangement = Arrangement.spacedBy(12.dp) // spacing between every Person
                ) {
                    items(items = getAllData) { person ->
                        CustomItem(person = person)
                    }
                }*/
            }
        }
    }
}
*/

