package com.example.rowsandcolumns

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rowsandcolumns.ui.theme.RowsAndColumnsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RowsAndColumnsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    /*modifier = Modifier.fillMaxSize(),(if i let this, the screen will be auto fit to device dimensions */
                    color = MaterialTheme.colors.background
                ) {
                    Row(modifier = Modifier
                        .height(500.dp)
                        .width(500.dp)
                        .background(Color.LightGray),
                        horizontalArrangement = Arrangement.Start
                    ) {
                        CustomItem(weight = 3f, color = MaterialTheme.colors.secondary)
                        CustomItem(weight = 1f)
                    }
                }
            }
        }
    }
}

//Row
@Composable
fun RowScope.CustomItem(weight: Float, color: Color = MaterialTheme.colors.primary){
    Surface(
        modifier = Modifier
            .width(50.dp)
            .height(50.dp)
            .weight(weight),
        color = color
    ) {}
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RowsAndColumnsTheme {
        Row(modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
        ) {
            CustomItem(weight = 3f, color = MaterialTheme.colors.secondary)
            CustomItem(weight = 1f)
        }
    }
}


//Column
@Composable
fun ColumnScope.CustomItem(weight: Float, color: Color = MaterialTheme.colors.primary){
    Surface(
        modifier = Modifier
            .width(50.dp)
            .weight(weight),
        color = color
    ) {}
}
@Preview(showBackground = true)
@Composable
fun DefaultPreviews() {
    RowsAndColumnsTheme {
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            CustomItem(weight = 3f, color = MaterialTheme.colors.secondary)
            CustomItem(weight = 1f)
        }
    }
}


//Column test
@Preview(showBackground = true)
@Composable
fun DefaultPreviewColumn(){
    RowsAndColumnsTheme{
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.End,
        ) {
            CustomItem(weight = 3f, color = MaterialTheme.colors.secondary)
            CustomItem(weight = 3f)
        }
    }
}

//Row test
@Preview(showBackground = true)
@Composable
fun DefaultPreviewCRow(){
    RowsAndColumnsTheme{
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.End,
        ) {
            CustomItem(weight = 3f, color = MaterialTheme.colors.secondary)
            CustomItem(weight = 3f)
        }
    }
}

