package com.example.paging3app.data.paging

import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import com.example.paging3app.data.local.UnsplashDatabase
import com.example.paging3app.data.remote.UnsplashApi
import com.example.paging3app.model.UnsplashImage
import javax.inject.Inject

@OptIn(ExperimentalPagingApi::class)
class UnsplashRemoteMediator @Inject constructor(
    private val unsplashApi: UnsplashApi,
    private val unsplashDatabase: UnsplashDatabase
): RemoteMediator<Int, UnsplashImage>() {
    override suspend fun load(
        loadType: LoadType,
        state: PagingState<Int, UnsplashImage>
    ): MediatorResult {
        TODO("Not yet implemented")
    }
}