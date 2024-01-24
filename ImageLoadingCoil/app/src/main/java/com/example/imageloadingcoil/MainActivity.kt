package com.example.imageloadingcoil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
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
        val painter = rememberImagePainter(data = "https://avatars.githubusercontent.com/u/14994036?v=4",
        builder = {

        })
        Image(painter = painter, contentDescription = "Android Picture")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ImageLoadingCoilTheme {
        CoilImage()
    }
}