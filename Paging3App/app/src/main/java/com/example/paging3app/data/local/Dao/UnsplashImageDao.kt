package com.example.paging3app.data.local.Dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.paging3app.model.UnsplashImage

@Dao
interface UnsplashImageDao {

    //Using Paging3 Lib, so i don't get all the data at once, Instead we will paginated to our database page by page
    @Query("SELECT * FROM unsplash_image_table")
    fun getAllImages(): PagingSource<Int, UnsplashImageDao> //And we will paginate through our room database as well just specifying this return type

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addImages(images: List<UnsplashImage>)

    @Query("DELETE FROM unsplash_image_table")
    suspend fun deleteAllImages()
}