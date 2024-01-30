package com.example.lazycolumn.repository

import com.example.lazycolumn.model.Anime

class AnimeRepository {
    fun getAllData(): List<Anime>{
        return listOf(
            Anime(
                id = 0,
                order = 1,
                name = "Fate/Zero",
                photoUrl = ""
            )
        )
    }
}