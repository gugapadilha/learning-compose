package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DefaultPreview4()
                }
            }
        }
    }
}

@Composable
fun CustomText(){
    Column(
        modifier = Modifier.fillMaxSize()){
        Text(
            text = stringResource(id = R.string.app_name),
            modifier = Modifier
                .background(MaterialTheme.colors.primary) //if i put this background after padding that will not paint the padding
                .padding(16.dp)
                .width(200.dp),
            color = Color.White,
            fontSize = MaterialTheme.typography.h6.fontSize,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.End
        )
    }
}

@Composable
fun CustomText2(){
    Text(
        buildAnnotatedString {
            withStyle(style = ParagraphStyle(
                textAlign = TextAlign.Center
            )){
            withStyle(style = SpanStyle(
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )){
                append("A")
            }
            append("B")
            append("C")
            append("D")
            }
        }, modifier = Modifier
            .fillMaxWidth()
            .background(Color.Yellow)
    )
}

@Composable
fun CustomText3(){
    Text(
        text = "Hello World!".repeat(20),
        maxLines = 2,
        overflow = TextOverflow.Ellipsis
    )
}

@Composable
fun CustomText4(){
    SelectionContainer {
        Column{ //now allows me to copy this text
            Text(text = "Text position 1")
            DisableSelection { //now cancells every text that is inside to do not copy
                Text(text = "Text position 2")
            }
            Text(text = "Text position 3")
        }
    }
}

@Composable
fun CustomText5(
    normalText: String,
    superText: String,
    normalFontSize: TextUnit = MaterialTheme.typography.subtitle1.fontSize,
    normalFontWeight: FontWeight = FontWeight.Bold,
    superTextFontSize: TextUnit = MaterialTheme.typography.subtitle2.fontSize,
    superTextFontWeight: FontWeight = FontWeight.Normal
){
    Text(buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                fontSize = normalFontSize,
                fontWeight = normalFontWeight,
                letterSpacing = 2.sp
            )
        ){
            append(normalText)
        }
        withStyle(style = SpanStyle(
            fontSize = superTextFontSize,
            fontWeight = superTextFontWeight,
            baselineShift = BaselineShift.Subscript, //text goes down
            //baselineShift = BaselineShift.Superscript, //text goes up
        )
        ){
            append(superText)
        }
    })
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        Column(
            modifier = Modifier.fillMaxSize()){
            CustomText()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    MyApplicationTheme {
        Column(
            modifier = Modifier.fillMaxSize()){
            CustomText2()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    MyApplicationTheme {
        Column(
            modifier = Modifier.fillMaxSize()){
            CustomText3()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview4() {
    MyApplicationTheme {
        Column(
            modifier = Modifier.fillMaxSize()){
            CustomText4()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview5() {
    MyApplicationTheme {
        Column(
            modifier = Modifier.fillMaxSize()){
            CustomText5(
                normalText = "Gustavo",
                superText = "Padilha",
                superTextFontWeight = FontWeight.Light
                )
        }
    }
}