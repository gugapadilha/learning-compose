package com.example.adaptativelayout.screen.home

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.example.adaptativelayout.data.CustomData
import com.example.adaptativelayout.screen.viewmodel.HomeViewModel

@Composable
fun HomeScreen(homeViewModel: HomeViewModel = viewModel()) {

    val items = homeViewModel.items

    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(items = items, key = { it.id }) {
            CustomCard(data = it)
        }
    }

}

@Composable
fun CustomCard(data: CustomData) {
    Row(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = Color.LightGray
            )
    ) {
        AsyncImage(
            modifier = Modifier
                .weight(1f),


        )
    }
}