package com.example.kotlin_androidstudio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlin_androidstudio.ui.theme.Kotlin_AndroidStudioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Kotlin_AndroidStudioTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    main_page()
                }
            }
        }
    }
}

@Composable
fun main_page(){
//    Tutorial1("NickName")
//    Tutorial2("Korean")
    Tutorial3()
}
@Composable
fun Tutorial1(name: String) {
    Text(
        text = "Hello, my name is $name!", Modifier.padding(24.dp)
    )
}
@Composable
fun Tutorial2(language: String){
    val image = painterResource(R.drawable.androidparty)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        contentScale = ContentScale.Crop
    )
    if (language == "Korean")
        Tutorial2_text(stringResource(R.string.Happy_Birthday_KOR), stringResource(R.string.signature_text_KOR))
    else if (language == "English")
        Tutorial2_text(stringResource(R.string.Happy_Birthday_ENG), stringResource(R.string.signature_text_ENG))
    else
        printText("Unknown Language")
}
@Composable
fun Tutorial2_text(message: String, from: String){
    Column{
        Text(
            text = message,
            fontSize = 36.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(
                    top = 16.dp
                )
        )

        Text(
            text = from,
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.End)
                .padding(
                    start = 16.dp,
                    end = 16.dp
                )
        )
    }
}

@Composable
fun Tutorial3(){
    val image = painterResource(R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
        )
        Tutorial3_Content("tutorial")
    }
}

@Composable
fun Tutorial3_Content(name: String){
    Text(
        text = "Jetpack Compose $name",
        fontSize = 24.sp,
        modifier = Modifier
            .wrapContentWidth(Alignment.CenterHorizontally)
            .padding(
                start = 16.dp,
                end = 16.dp,
                bottom = 16.dp,
                top = 16.dp
            )
    )

    Text(
        text = "Jetpack Compose is a modern toolkit for " +
                "building native Android UI. Compose" +
                "simplifies and accelerates UI development on" +
                "Android with less code, powerful tools, and" +
                "intuitive Kotlin APIs.",
        fontSize = 16.sp,
        modifier = Modifier
            .padding(
                start = 16.dp,
                end = 16.dp
            ),
        textAlign = TextAlign.Justify
    )
    Text(
        text = "In this $name, you build a simple UI" +
                "component with declarative function. You" +
                "call Compose functions to say what elements" +
                "you want and the Compose compiler does the" +
                "rest. Compose is built around Composable" +
                "functions. These functions let you define your" +
                "app's UI programmatically because they let" +
                "you describe how it should look and provide" +
                "data dependencies, rather than focus on the" +
                "process of the UI is construction, such as" +
                "initializing and element and then attaching it to" +
                "a parent. To create a Composable function," +
                "you add the @Composable annotation to the" +
                "function name.",
        fontSize = 16.sp,
        modifier = Modifier
            .padding(
                start = 16.dp,
                end = 16.dp,
                top = 16.dp
            ),
        textAlign = TextAlign.Justify
    )
}
@Composable
fun printText(message: String) {
    Text(
        text = message
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Kotlin_AndroidStudioTheme {
        main_page()
    }
}

