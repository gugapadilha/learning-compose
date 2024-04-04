package com.example.adaptativelayout.screen.viewmodel

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.adaptativelayout.data.CustomData

class HomeViewModel : ViewModel() {

    private var _items = mutableStateListOf<CustomData>()
    val items: List<CustomData> = _items

    init {
        getData()
    }

    private fun getData() {
        for (number in 0 until 10) {
            _items.add(
                element = CustomData(
                id = number,
                    image = "https://picsum.photos/id/$number/300/300",
                    title = "#$number Lorem Ipsum",
                    description = "Lorem ipsum dolor sit amet, consectetur adisplicit elit, sed to boka cham ga oshieta kureta, iron na mitamenirareu apurinan date",
                    badges = listOf(
                        Icons.Default.Check,
                        Icons.Default.Edit,
                        Icons.Default.Face,
                        Icons.Default.Email,
                        Icons.Default.List,
                        Icons.Default.Home
                    )
                )
            )
        }
    }

}