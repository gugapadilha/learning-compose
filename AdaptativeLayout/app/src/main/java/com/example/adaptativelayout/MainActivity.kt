package com.example.adaptativelayout

import HomeScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.adaptativelayout.ui.theme.AdaptativeLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdaptativeLayoutTheme {
                HomeScreen()
            }
        }
    }
}

