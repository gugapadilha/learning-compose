package com.example.swipeablecomponent

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import me.saket.swipe.SwipeAction
import me.saket.swipe.SwipeableActionsBox

@Composable
fun SwipeableComponent() {
    val archive = SwipeAction(
        onSwipe = {
            Log.d("Archive", "Archive")
        },
        icon = {
            Icon(
                painter = painterResource(id = R.drawable.baseline_archive_24),
                contentDescription = null,
                tint = Color.White
            )
        },
        background = Color.Green
    )

    val email = SwipeAction(
        onSwipe = {
            Log.d("Email","Email")
        },
        icon = {
            Icon(
                painter = painterResource(id = R.drawable.baseline_email_24),
                contentDescription = null,
                tint = Color.White
            )
        },
        background = Color.Green
    )

    SwipeableActionsBox() {

    }

    Row(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.surface)
            .padding(horizontal = 16.dp)
            .padding(vertical = 8.dp)
    ) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(size = 50.dp))
                .background(MaterialTheme.colorScheme.primary)
                .size(50.dp)

        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(
            modifier = Modifier.weight(7f)) {
            Text(
                text = "Title", style = TextStyle(
                    fontSize = MaterialTheme.typography.titleLarge.fontSize,
                    fontWeight = FontWeight.Bold
                )
            )
            Text(text = "Some random text.")
        }

    }
}

@Preview
@Composable
fun PreviewSwipeableComponent () {
    SwipeableComponent()
}