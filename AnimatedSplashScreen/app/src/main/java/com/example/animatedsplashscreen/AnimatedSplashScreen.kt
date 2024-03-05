package com.example.animatedsplashscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.animatedsplashscreen.ui.theme.Purple80
import com.example.animatedsplashscreen.ui.theme.PurpleGrey80

@Composable
fun AnimatedSplashScreen() {
    Splash()
}

@Composable
fun Splash() {
    Box(
        modifier = Modifier
        .background(if (isSystemInDarkTheme()) Color.Black else PurpleGrey80)
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    )
    {
        Icon(
            modifier = Modifier.size(120.dp),
            imageVector = Icons.Default.Email,
            contentDescription = "Logo Icon",
            tint = Color.White
        )
    }
}