package com.example.paging3app.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.paging3app.data.local.Dao.UnsplashImageDao
import com.example.paging3app.data.local.Dao.UnsplashRemoteKeysDao
import com.example.paging3app.model.UnsplashImage
import com.example.paging3app.model.UnsplashRemoteKeys

@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashDatabase : RoomDatabase() {

    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao
}