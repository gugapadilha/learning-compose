package com.example.googlebuttonsignup

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
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
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.googlebuttonsignup.ui.theme.Shapes

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun GoogleButton(
    text: String = "Sign Up with Google",
    loadingText: String = "Creating Account...",
    icon: Painter = painterResource(id = R.drawable.ic_google_logo),
    shape: Shape = Shapes.medium,
    borderColor: Color = Color.LightGray,
    backgroundColor: Color = MaterialTheme.colors.surface,
    progressIndicationColor: Color = MaterialTheme.colors.primary,
    onClicked: () -> Unit
){
    var clicked by remember { mutableStateOf(false) }

    Surface(
        onClick = {clicked = !clicked}, //if is false will change to true and vice versa
        shape = shape,
        border = BorderStroke(width = 1.dp, color = borderColor),
        color = backgroundColor
    ) {
        Row(
            modifier = Modifier
                .padding(
                    start = 12.dp,
                    end = 16.dp,
                    top = 12.dp,
                    bottom = 12.dp
                )
                .animateContentSize(
                    animationSpec = tween(
                        durationMillis = 300,
                        easing = LinearOutSlowInEasing
                    )
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(painter = icon,
                contentDescription = "Google Button",
                tint = Color.Unspecified
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = if (clicked) loadingText else text) //when text is clicked, show other text

            if(clicked){
                Spacer(modifier = Modifier.width(16.dp))
                CircularProgressIndicator(
                    modifier = Modifier
                        .height(16.dp)
                        .width(16.dp),
                    strokeWidth = 2.dp,
                    color = progressIndicationColor
                )
                onClicked()
            }
        }
    }
}

@Composable
@Preview
private fun GoogleButtonPreview(){
    GoogleButton(
        text = "Sign up with Google",
        loadingText = "Creating Account...",
        onClicked = {}
    )
}


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun GoogleButton2(
    text: String = "Sign Up with Google",
    loadingText: String = "Creating Account...",
    icon: Painter = painterResource(id = R.drawable.ic_google_logo),
    shape: Shape = Shapes.medium,
    borderColor: Color = Color.LightGray,
    backgroundColor: Color = MaterialTheme.colors.surface,
    progressIndicationColor: Color = MaterialTheme.colors.primary,
    onClicked: () -> Unit
){
    var clicked by remember { mutableStateOf(false) }

    Surface(
        onClick = {clicked = !clicked}, //if is false will change to true and vice versa
        shape = shape,
        border = BorderStroke(width = 1.dp, color = borderColor),
        color = backgroundColor
    ) {
        Column(
            modifier = Modifier
                .padding(
                    start = 12.dp,
                    end = 16.dp,
                    top = 12.dp,
                    bottom = 12.dp
                )
                .animateContentSize(
                    animationSpec = tween(
                        durationMillis = 300,
                        easing = LinearOutSlowInEasing
                    )
                ),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Icon(painter = icon,
                contentDescription = "Google Button",
                tint = Color.Unspecified
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = if (clicked) loadingText else text) //when text is clicked, show other text

            if(clicked){
                Spacer(modifier = Modifier.width(16.dp))
                CircularProgressIndicator(
                    modifier = Modifier
                        .height(16.dp)
                        .width(16.dp),
                    strokeWidth = 2.dp,
                    color = progressIndicationColor
                )
                onClicked()
            }
        }
    }
}

@Composable
@Preview
private fun GoogleButtonPreview2(){
    GoogleButton2(
        text = "Sign up with Google",
        loadingText = "Creating Account...",
        onClicked = {}
    )
}