package com.example.sharedelementtransition.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.sharedelementtransition.model.mountains
import com.skydoves.orbital.Orbital

@Composable
fun ListScreen() {
    Orbital {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.surface)
        ){
            items(
                items = mountains,
                key = {it.title}
            ) {
                mountain ->
            }
        }
    }

}