package com.example.googlebuttonsignup

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
        Row(
            modifier = Modifier
                .padding(
                    start = 12.dp,
                    end = 16.dp,
                    top = 12.dp,
                    bottom = 12.dp
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(painter = painterResource(id = R.drawable.ic_google_logo),
                contentDescription = "Google Button",
                tint = Color.Unspecified)
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Sign up with Google")
        }
    }
}

@Composable
@Preview
private fun GoogleButtonPreview(){
    GoogleButton()
}