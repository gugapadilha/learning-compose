package com.example.paging3app.data.remote

import com.example.paging3app.model.UnsplashImage
import retrofit2.http.GET
import retrofit2.http.Query

interface UnsplashApi {

    @GET("/photos")
    suspend fun getAllImages(
        @Query("page") page: Int,
        @Query("per_page")per_page_: Int
    ) : List<UnsplashImage>
}
