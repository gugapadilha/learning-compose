package com.example.paging3app.data.remote

import com.example.paging3app.model.UnsplashImage
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {

    @Headers("Authorization: Client-ID jcsfM8MCelC3qj29L7CQJFFmJKz6mzI1Hjhd-GVliec")
    @GET("/photos")
    suspend fun getAllImages(
        @Query("page") page: Int, //Paging3 Lib will handle this page by itself
        @Query("per_page")per_page_: Int
    ) : List<UnsplashImage>

    @Headers("Authorization: Client-ID jcsfM8MCelC3qj29L7CQJFFmJKz6mzI1Hjhd-GVliec")
    @GET("/search/photos")
    suspend fun searchImages(
        @Query("page") page: Int, //Paging3 Lib will handle this page by itself
        @Query("per_page")per_page_: Int
    ) : List<UnsplashImage>
}
