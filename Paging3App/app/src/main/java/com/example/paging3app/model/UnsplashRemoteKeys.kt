package com.example.paging3app.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.paging3app.util.Constants.UNSPLASH_REMOTE_KEYS_TABLE

@Entity(tableName = UNSPLASH_REMOTE_KEYS_TABLE)
//The Pagging3 Lib will handle the number of requisitions and automatically will separate the pages
data class UnsplashRemoteKeys(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val prevPage: Int?,
    val nextPage: Int?
)