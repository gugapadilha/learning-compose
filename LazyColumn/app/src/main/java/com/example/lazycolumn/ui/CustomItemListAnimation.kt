package com.example.lazycolumn.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun CustomItemListAnimation(){
    var items by remember {
        mutableStateOf(
            listOf(
                "Kotlin",
                "Java",
                "Python",
                "Go",
                "C++",
                "C#"
            )
        )
    }
}