package com.example.stopwatchapplication.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.compose.animation.ExperimentalAnimationApi
import dagger.hilt.android.AndroidEntryPoint

@ExperimentalAnimationApi
@AndroidEntryPoint
class StopwatchService : Service() {


    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
    }
}