package com.example.googlebuttonsignup

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Row
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.googlebuttonsignup.ui.theme.Shapes

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun GoogleButton(){
    var clicked by remember { mutableStateOf(false) }

    Surface(
        onClick = {clicked = !clicked}, //if is false will change to true and vice versa
        shape = Shapes.medium,
        border = BorderStroke(width = 1.dp, color = Color.LightGray),
        color = MaterialTheme.colors.surface
    ) {
        Row {
           Icon(painter = painterResource(id = R.drawable.ic_google_logo), contentDescription = "Google Button")
        }
    }
}

@Composable
@Preview
private fun GoogleButtonPreview(){
    GoogleButton()
}