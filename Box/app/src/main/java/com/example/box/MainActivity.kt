package com.example.box

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.box.ui.theme.BoxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoxTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
  Box(
      modifier = Modifier.fillMaxSize(),
      contentAlignment = Alignment.TopCenter
  ){
      Box(
          modifier = Modifier
              .background(Color.Blue)
              .width(100.dp)
              .height(100.dp)
              .verticalScroll(rememberScrollState())
      ){
          Text(
              text = "I'm Guga Padilha",
              fontSize = 40.sp,
              color = Color.White
              )
      }
  }

}

@Composable
fun GreetingTest2() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ){
        Box(
            modifier = Modifier
                .background(Color.Blue),
            contentAlignment = Alignment.CenterEnd
        ){
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color.Green))
            Text(
                text = "I'm Guga Padilha",
                fontSize = 40.sp,
                color = Color.White
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BoxTheme {
        Greeting()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewTest2() {
    BoxTheme {
        GreetingTest2()
    }
}