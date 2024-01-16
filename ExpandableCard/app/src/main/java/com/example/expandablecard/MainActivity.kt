package com.example.expandablecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.expandablecard.ui.theme.ExpandableCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExpandableCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ExpandableCard(
                        title = "My Title",
                        description = "\"Lorem ipsum dolor sit amet, consectur adispcing elit," +
                                "sed do eismow temport incidunt ut labore rt magna ali," +
                                "enim ad minim venuiiam quis nostrud exercitation lamma" +
                                "laboris nisi ut alinguioe ex ea commodod consqueat des",
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ExpandableCardTheme {
        ExpandableCard(
            title = "My Title",
            description = "\"Lorem ipsum dolor sit amet, consectur adispcing elit," +
                    "sed do eismow temport incidunt ut labore rt magna ali," +
                    "enim ad minim venuiiam quis nostrud exercitation lamma" +
                    "laboris nisi ut alinguioe ex ea commodod consqueat des",
        )
    }
}