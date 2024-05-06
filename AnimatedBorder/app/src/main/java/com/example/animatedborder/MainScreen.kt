package com.example.animatedborder

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surface),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AnimatedBorderCard(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 24.dp),
            shape = RoundedCornerShape(8.dp),
            borderWidth = 1.dp,
            gradient = Brush.linearGradient(listOf(Color.Magenta, Color.Cyan)),
            onCardClick = {}
        ){
            Column(
                modifier = Modifier.padding(all = 24.dp)){
                Text(
                    fontSize = MaterialTheme.typography.displaySmall.fontSize,
                    fontWeight = FontWeight.Bold,
                    text = "Welcome"
                )
            }

        }

    }
    
}

@Composable
    fun AnimatedBorderCard(
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(size = 0.dp),
    borderWidth: Dp = 2.dp,
    gradient: Brush = Brush.sweepGradient(listOf(Color.Gray, Color.White)),
    animationDuration: Int = 10000,
    onCardClick: () -> Unit = {},
    content: @Composable () -> Unit
    ) {
        val infiniteTransition = rememberInfiniteTransition(label = "Infinite Color Animation")
        val degrees by infiniteTransition.animateFloat(
            initialValue = 0f,
            targetValue = 360f,
            animationSpec = infiniteRepeatable(
                animation = tween(durationMillis = animationDuration, easing = LinearEasing),
                repeatMode = RepeatMode.Restart
            ),
            label = "Infinite Colors"
        )

        Surface(
            modifier = modifier
                .clip(shape)
                .clickable { onCardClick() },
            shape = shape
        ) {
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(borderWidth)
                    .drawWithContent {
                        rotate(degrees = degrees) {
                            drawCircle(
                                brush = gradient,
                                radius = size.width,
                                blendMode = BlendMode.SrcIn,
                            )
                        }
                        drawContent()
                    },
                color = MaterialTheme.colorScheme.surface,
                shape = shape
            ) {
                content()
            }
        }
    }
