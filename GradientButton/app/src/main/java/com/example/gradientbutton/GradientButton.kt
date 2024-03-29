package com.example.gradientbutton

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gradientbutton.ui.theme.color1
import com.example.gradientbutton.ui.theme.color2
import com.example.gradientbutton.ui.theme.color3
import com.example.gradientbutton.ui.theme.color4

@Composable
fun GradientButton(
    text: String,
    textColor: Color,
    gradient: Brush,
    onClick: () -> Unit
){

    Button(
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
        contentPadding = PaddingValues(), //used to do corner rounded shape for button
        onClick = { onClick() })
    {
        Box(
            modifier = Modifier
                .background(gradient)
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .height(50.dp)
                .width(100.dp),
            contentAlignment = Alignment.Center
        ){
            Text(text = text, color = textColor)
        }
    }
    Spacer(modifier = Modifier.padding(16.dp))

}

@Composable
fun GradientButton2(
    text: String,
    textColor: Color,
    gradient: Brush,
    onClick: () -> Unit
){

    Button(
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
        contentPadding = PaddingValues(), //used to do corner rounded shape for button
        onClick = { onClick() })
    {
        Box(
            modifier = Modifier
                .background(gradient)
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .height(50.dp)
                .width(100.dp),
            contentAlignment = Alignment.Center
        ){
            Text(text = text, color = textColor)
        }
    }
    Spacer(modifier = Modifier.padding(16.dp))

}
@Composable
fun GradientButton3(gradient: Brush){
    Button(
        onClick = { },
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
        contentPadding = PaddingValues(),
        modifier = Modifier
            .height(50.dp)
            .width(100.dp)
            .background(gradient)
            .padding(8.dp),
    ) {
        Text(
            text = "Sim",
            modifier = Modifier.align(Alignment.CenterVertically), // Alinha o texto verticalmente ao centro
            color = Color.White
        )
    }
}

@Preview
@Composable
fun GradientButtonPreview(){
    GradientButton(
        text = "Button",
        textColor = Color.White,
        gradient = Brush.horizontalGradient(
            colors = listOf(
                color1,
                color2
            )
        )
    ) {}
}

@Preview
@Composable
fun GradientButtonPreview2(){
    GradientButton2(
        text = "Button",
        textColor = Color.White,
        gradient = Brush.horizontalGradient(
            colors = listOf(
                color4,
                color3,
                color2,
                color1
            )
        )
    ) {}
}

@Preview
@Composable
fun GradientButtonPreview3(){
    GradientButton3(
        gradient = Brush.horizontalGradient(
            listOf(
                color1,
                color4
            )
        )
    )

}