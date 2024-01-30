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
fun CustomAnimeItem(anime: Anime){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "${anime.order}",
            color = Color.White,
            fontSize = Typography.h5.fontSize,
            fontWeight = FontWeight.Light
        )
        Image(
            painter = rememberImagePainter(data = anime.photoUrl, builder = {
            }),
            contentDescription = "Anime icon",
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
            .height(12.dp)
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
        )
    )
}