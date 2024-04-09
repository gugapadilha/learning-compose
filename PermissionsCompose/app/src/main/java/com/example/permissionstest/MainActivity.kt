package com.example.permissionstest

import android.Manifest
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.google.accompanist.permissions.ExperimentalPermissionsApi

@ExperimentalPermissionsApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
              //single permission to only contacts
//            RequestPermission(permission = Manifest.permission.READ_CONTACTS)

            //multiple permissions to both contacts and camera (its better to allow permissions in separate situations to follow best practices
            RequestMultiplePermissions(
                permissions = listOf(
                    Manifest.permission.READ_CONTACTS,
                    Manifest.permission.CAMERA
                )
            )
        }
    }
}