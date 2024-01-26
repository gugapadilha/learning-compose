package com.example.gradientbutton

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.gradientbutton.ui.theme.GradientButtonTheme
import com.example.gradientbutton.ui.theme.color1
import com.example.gradientbutton.ui.theme.color2

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GradientButtonTheme {
                // A surface container using the 'background' color from the theme
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    GradientButton(
                        text = "Button",
                        textColor = Color.White,
                        gradient = Brush.horizontalGradient(
                            colors = listOf(
                                color1,
                                color2
                            )
                        )
                    ) { }
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Button")
                    }
                }
            }
        }
    }
}
