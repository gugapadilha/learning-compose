package com.example.paging3app.di

import android.content.Context
import androidx.room.Room
import com.example.paging3app.data.local.UnsplashDatabase
import com.example.paging3app.util.Constants.UNSPLASH_DATABASE
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    fun provideDatabase(
        @ApplicationContext context: Context
    ): UnsplashDatabase {
       return Room.databaseBuilder(
           context,
           UnsplashDatabase::class.java,
           UNSPLASH_DATABASE
       ).build()

    }

}