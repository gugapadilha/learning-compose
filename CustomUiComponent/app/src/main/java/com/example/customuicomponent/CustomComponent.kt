package com.example.customuicomponent

import androidx.compose.ui.graphics.*
import androidx.compose.ui.geometry.*
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.animation.core.*
import androidx.compose.runtime.*

@Composable
fun CustomComponent(
    canvasSize: Dp = 300.dp,
    indicationValue: Int = 0,
    maxIndicationValue: Int = 1000,
    backgroundIndicatorColor: Color = MaterialTheme.colors.onSurface.copy(alpha = 0.1f),
    backgrondIndicatorStrokeWidth: Float = 100f,
    foregroundIndicatorColor: Color = MaterialTheme.colors.primary,
    foregroundIndicatorStrokeWidth: Float = 100f
){

    var allowedIndicatorValue by remember {
        mutableStateOf(maxIndicationValue)
    }

    allowedIndicatorValue = if (indicationValue <= maxIndicationValue){
        indicationValue
    } else {
        maxIndicationValue
    }

    val animatedIndicatorValue = remember { Animatable(initialValue = 0f) }
    LaunchedEffect(key1 = allowedIndicatorValue){
        animatedIndicatorValue.animateTo(allowedIndicatorValue.toFloat())
    }

    val percentage = (animatedIndicatorValue.value / maxIndicationValue) * 100

    val sweepAngle by animateFloatAsState(
        targetValue = (2.4 * percentage).toFloat(), //using 2.4 cause of 240 that we are using to do de max angle
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
                    indicatorStrokeWidth = foregroundIndicatorStrokeWidth
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