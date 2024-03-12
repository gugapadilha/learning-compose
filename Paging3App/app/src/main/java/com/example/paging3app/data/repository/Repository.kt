package com.example.paging3app.data.repository

import androidx.paging.ExperimentalPagingApi
import com.example.paging3app.data.local.UnsplashDatabase
import com.example.paging3app.data.remote.UnsplashApi

import javax.inject.Inject

@ExperimentalPagingApi
class Repository @Inject constructor(
    private val unsplashApi: UnsplashApi,
    private val unsplashDatabase: UnsplashDatabase
) {


}