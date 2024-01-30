package com.example.lazycolumn.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.lazycolumn.model.Anime
import com.example.lazycolumn.ui.theme.Typography

@Composable
fun CustomAnimeItem(anime: Anime, position: Int){
    val defaultColor = Color.White
    val textColor = when (position) {
        0 -> Color(0xFFFFD700)
        1 -> Color(0xFFC0C0C0)
        2 -> Color(0xFFCD7F32)
        else -> defaultColor
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "${anime.order}°",
            color = textColor, // Usar a cor determinada
            fontSize = Typography.h5.fontSize,
            fontWeight = FontWeight.Light
        )
        Image(
            painter = rememberImagePainter(data = anime.photoUrl, builder = {
            }),
            contentDescription = "Anime picture",
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth()
        )
        Text(
            text = anime.name,
            color = Color.White,
            fontSize = Typography.h4.fontSize,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(10.dp)
            .background(Color.Black)
        )
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(Color.White)
        )
    }
}

@Composable
@Preview
fun CustomAnimePreview(){
    CustomAnimeItem(
        anime = Anime(
            id = 0,
            order = 1,
            name = "Fate Zero",
            photoUrl = "https://www.crunchyroll.com/imgsrv/display/thumbnail/1200x675/catalog/crunchyroll/fdc0dff409f19dfd8ffff5037257ac98.jpe"
        ),
        position = 0
    )
}