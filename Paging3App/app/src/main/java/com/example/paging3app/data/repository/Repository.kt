package com.example.paging3app.data.repository

import androidx.compose.foundation.pager.HorizontalPager
import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.paging3app.data.local.UnsplashDatabase
import com.example.paging3app.data.paging.UnsplashRemoteMediator
import com.example.paging3app.data.remote.UnsplashApi
import com.example.paging3app.model.UnsplashImage
import com.example.paging3app.util.Constants.ITEMS_PER_PAGE
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ExperimentalPagingApi
class Repository @Inject constructor(
    private val unsplashApi: UnsplashApi,
    private val unsplashDatabase: UnsplashDatabase
) {


}