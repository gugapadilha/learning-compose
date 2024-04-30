package com.example.galleryhorizontaltransition

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

@Composable
fun MainScreen() {

    val images = remember {
        mutableListOf(
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6
        )
    }
}