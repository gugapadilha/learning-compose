package com.example.imageloadingcoil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
                    CoilImage()
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

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ImageLoadingCoilTheme {
        CoilImage()
    }
}