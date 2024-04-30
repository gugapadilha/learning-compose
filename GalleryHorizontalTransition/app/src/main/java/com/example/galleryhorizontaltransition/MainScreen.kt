package com.example.galleryhorizontaltransition

import android.annotation.SuppressLint
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest

@OptIn(ExperimentalFoundationApi::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen() {

    val images = remember {
        mutableListOf(
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4
        )
    }

    val pagerState = rememberPagerState(pageCount = { images.size })
    val matrix = remember { ColorMatrix() } //remember recomposition color image

    Scaffold(
        modifier = Modifier.padding(vertical = 48.dp)
    ) {
        HorizontalPager(state = pagerState) { index ->
            val pageOffset = (pagerState.currentPage - index) + pagerState.currentPageOffsetFraction

            val saturation = if (pageOffset != 0f) 0f else 1f

            val matrix = ColorMatrix().apply {
                setToSaturation(saturation)
            }
            AsyncImage(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .graphicsLayer {
                        scaleX = if (pageOffset != 0f) 0.75f else 1f
                        scaleY = if (pageOffset != 0f) 0.75f else 1f
                    },
                model = ImageRequest.Builder(LocalContext.current).data(images[index]).build(),
                contentDescription = "Image",
                contentScale = ContentScale.Crop,
                colorFilter = ColorFilter.colorMatrix(matrix)
            )
        }
    }
}