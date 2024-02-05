package com.example.customuicomponent

import androidx.compose.animation.Animatable
import androidx.compose.ui.graphics.*
import androidx.compose.ui.geometry.*
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.ContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.animation.core.*
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue

@Composable
fun CustomComponent(
    canvasSize: Dp = 300.dp,
    indicationValue: Int = 0,
    maxIndicationValue: Int = 100,
    backgroundIndicatorColor: Color = MaterialTheme.colors.onSurface.copy(alpha = 0.1f) ,
    backgrondIndicatorStrokeWidth: Float = 100f,
    foregroundIndicatorColor: Color = MaterialTheme.colors.primary,
    foregroundIndicatorStrokeWidht: Float = 100f
){
    val animatedIndicatorValue = remember { Animatable(initialValue = 0f) }
    LaunchedEffect(key1 = indicationValue){
        animatedIndicatorValue.animateTo(indicationValue.toFloat())
    }

    val percentage = (animatedIndicatorValue.value / maxIndicationValue) * 100

    val sweepAngle by animateFloatAsState(
        targetValue = (2.4 * percentage).toFloat(),
        animationSpec = tween(1000)
    )

    Column(
        modifier = Modifier
            .size(canvasSize)
            .drawBehind {
                val componentSize = size / 1.25f
                backgroundIndicator(
                    componentSize = componentSize,
                    indicatorColor = backgroundIndicatorColor,
                    indicatorStrokeWidth = backgrondIndicatorStrokeWidth
                )
                foregroundIndicatior(
                    sweepAngle = sweepAngle,
                    componentSize = componentSize,
                    indicatorColor = foregroundIndicatorColor,
                    indicatorStrokeWidth = backgrondIndicatorStrokeWidth
                )
            }
    ) {

    }
}

fun DrawScope.backgroundIndicator(
    componentSize: Size,
    indicatorColor: Color,
    indicatorStrokeWidth: Float
){
    drawArc(
        size = componentSize,
        color = indicatorColor,
        startAngle = 150f, //starting angle
        sweepAngle = 240f, //shape distance around the 360 clock
        useCenter = false,
        style = Stroke(
            width = indicatorStrokeWidth,
            cap = StrokeCap.Round
        ),
        topLeft = Offset(
            x = (size.width - componentSize.width) / 2f ,
            y = (size.height - componentSize.height) / 2f ,
        )
    )
}

fun DrawScope.foregroundIndicatior(
    sweepAngle: Float,
    componentSize: Size,
    indicatorColor: Color,
    indicatorStrokeWidth: Float
){
    drawArc(
        size = componentSize,
        color = indicatorColor,
        startAngle = 150f, //starting angle
        sweepAngle = sweepAngle, //shape distance around the 360 clock
        useCenter = false,
        style = Stroke(
            width = indicatorStrokeWidth,
            cap = StrokeCap.Round
        ),
        topLeft = Offset(
            x = (size.width - componentSize.width) / 2f ,
            y = (size.height - componentSize.height) / 2f ,
        )
    )
}

@Composable
@Preview(showBackground = true)
fun CustomComponentPreview(){
    CustomComponent()
}