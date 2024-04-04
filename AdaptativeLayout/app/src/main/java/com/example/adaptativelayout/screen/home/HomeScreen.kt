package com.example.adaptativelayout.screen.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.adaptativelayout.screen.viewmodel.HomeViewModel

@Composable
fun HomeScreen(homeViewModel: HomeViewModel = viewModel()) {

    val items = homeViewModel.items

    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(items = items, key = {it.id}) {
            CustomCard(data = it)
        }
    }

}

@Composable
fun CustomCard(data: CustomData) {

}