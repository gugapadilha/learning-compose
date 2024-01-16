package com.example.expandablecard

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.expandablecard.ui.theme.Shapes

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ExpandableCard(){
    var expandedState by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .animateContentSize(
                animationSpec = tween(
                    delayMillis = 300,
                    easing = LinearOutSlowInEasing
                )
            ),
        shape = Shapes.medium,
        onClick = {
            expandedState = !expandedState
        }
    ) {

    }
}