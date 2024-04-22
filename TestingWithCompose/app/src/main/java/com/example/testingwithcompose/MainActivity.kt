package com.example.testingwithcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.testingwithcompose.ui.theme.TestingWithComposeTheme
import com.stevdzasan.messagebar.ContentWithMessageBar
import com.stevdzasan.messagebar.rememberMessageBarState
import java.lang.Exception

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestingWithComposeTheme {
                val state = rememberMessageBarState()
                ContentWithMessageBar(messageBarState = state) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Button(onClick =  {
                            state.addError(exception = Exception("Internet Unavailable."))
                        }) {
                            Text(text = "Error")
                        }
                        Button(onClick = {
                            state.addSuccess(message = "Successfully Updated. ")
                        }) {
                            Text(text = "Success")
                        }

                    }
                }
            }
        }
    }
}

