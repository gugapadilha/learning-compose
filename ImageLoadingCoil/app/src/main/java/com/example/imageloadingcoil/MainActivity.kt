package com.example.imageloadingcoil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.imageloadingcoil.ui.theme.ImageLoadingCoilTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImageLoadingCoilTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CoilImage2()
                }
            }
        }
    }
}

@Composable
fun CoilImage() {
    Box(
        modifier = Modifier
            .height(150.dp)
            .width(150.dp),
    contentAlignment = Alignment.Center)
    {
        AsyncImage(model = ImageRequest.Builder(LocalContext.current)
            .data(stringResource(id = R.string.image_url))
            .crossfade(2000)
            .placeholder(R.drawable.baseline_image_24)
            .error(R.drawable.baseline_error_24)
            .build(),
        contentDescription = "Android Image",
        contentScale = ContentScale.Crop,
        modifier = Modifier.clip(CircleShape))
    }
}


@Composable
fun CoilImage2() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray),
        contentAlignment = Alignment.Center)
    {
        Column(
            modifier = Modifier.
            fillMaxWidth()
            .background(Color.LightGray),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center) {
                Text(
                    text = "Best Anime Ever",
                    fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    fontSize = 24.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth(),
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            AsyncImage(model = ImageRequest.Builder(LocalContext.current)
                .data(stringResource(id = R.string.image_url2))
                .crossfade(3000)
                .placeholder(R.drawable.baseline_image_24)
                .error(R.drawable.baseline_error_24)
                .build(),
                contentDescription = "Android Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.clip(RectangleShape))
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}
