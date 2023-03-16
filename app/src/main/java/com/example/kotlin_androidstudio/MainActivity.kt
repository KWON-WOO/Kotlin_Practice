package com.example.kotlin_androidstudio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
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
//    Tutorial3()
//    Tutorial4()
//    Tutorial5()
    Tutorial6()
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
        Tutorial2_text(stringResource(R.string.Tutorial2_Happy_Birthday_KOR), stringResource(R.string.Tutorial2_signature_text_KOR))
    else if (language == "English")
        Tutorial2_text(stringResource(R.string.Tutorial2_Happy_Birthday_ENG), stringResource(R.string.Tutorial2_signature_text_ENG))
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
fun Tutorial4(){
    val image = painterResource(R.drawable.ic_task_completed)
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter = image,
            contentDescription = null
        )
        Tutorial4Text()
    }
}

@Composable
fun Tutorial4Text(){
    Text(
        text = "All tasks completed",
        fontWeight = Bold,
        fontSize = 24.sp,
        modifier = Modifier
            .padding(
                top = 24.dp,
                bottom = 8.dp
            )
    )
    Text(
        text = "Nick work!",
        fontSize = 16.sp
    )
}

@Composable
fun Tutorial5(){
    Column(modifier = Modifier.fillMaxWidth()){
        Row(modifier = Modifier.weight(1f)){
            Tutorial5Card(
                title = stringResource(R.string.Tutorial5_first_title),
                description = stringResource(R.string.Tutorial5_first_description),
                backgroundColor = Color.Green,
                modifier = Modifier.weight(1f)
            )
            Tutorial5Card(
                title = stringResource(R.string.Tutorial5_second_title),
                description = stringResource(R.string.Tutorial5_second_description),
                backgroundColor = Color.Yellow,
                modifier = Modifier.weight(1f)
            )
        }
        Row(modifier = Modifier.weight(1f)){
            Tutorial5Card(
                title = stringResource(R.string.Tutorial5_third_title),
                description = stringResource(R.string.Tutorial5_third_description),
                backgroundColor = Color.Cyan,
                modifier = Modifier.weight(1f)
            )
            Tutorial5Card(
                title = stringResource(R.string.Tutorial5_fourth_title),
                description = stringResource(R.string.Tutorial5_fourth_description),
                backgroundColor = Color.Gray,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun Tutorial5Card(
    title:String,
    description: String,
    backgroundColor: Color,
    modifier:Modifier = Modifier
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp)
    ){
        Text(
        text = title,
        fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun Tutorial6(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Tutorial6Title(name = "KWONWOO CHOI")
        Column(horizontalAlignment=Alignment.Start) {
            Tutorial6CardInfo(
                cardIcon = Icons.Filled.Phone,
                description = "+82(10) 1234-5678"
            )
            Tutorial6CardInfo(
                cardIcon = Icons.Filled.Share,
                description = "@qwerty"
            )
            Tutorial6CardInfo(
                cardIcon = Icons.Filled.Email,
                description = "ckw075@naver.com"
            )
        }
    }
}

@Composable
fun Tutorial6Title(name:String = "Unknown", compony:String = "Unknown") {
    val IconImage = painterResource(R.drawable.ic_channel_foreground)
    val backgroundIconImage = painterResource(R.drawable.ic_channel_background)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box {
            Image(
                painter = backgroundIconImage,
                contentDescription = null,
                Modifier.requiredSize(
                    width = 180.dp,
                    height = 180.dp
                )
            )
            Image(
                painter = IconImage,
                contentDescription = null,
                Modifier.requiredSize(
                    width = 180.dp,
                    height = 180.dp
                )
            )
        }
        Text(
            text = name,
            fontSize = 36.sp,
            modifier = Modifier.padding(top = 10.dp, bottom = 5.dp)
        )
        Text(
            text = compony,
            fontSize = 24.sp,
            modifier = Modifier.padding(bottom = 5.dp)
        )
    }
}

@Composable
fun Tutorial6CardInfo(
    cardIcon: ImageVector = Icons.Filled.Close,
    description:String = "Unknown"
){
    Row(){
        Icon(
            cardIcon,
            contentDescription =
            if (cardIcon == Icons.Filled.Close) "Unknown" else null
        )
        Spacer(Modifier.size(20.dp))
        Text(
            text = description,
            modifier = Modifier
                .padding(
                    top = 5.dp,
                    bottom = 5.dp
                )
        )
    }
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

