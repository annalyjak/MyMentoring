package com.lyjak.anna.mymentoring

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lyjak.anna.mymentoring.ui.theme.MyMentoringTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyMentoringTheme {
                Screen()
            }
        }
    }
}

@Composable
fun Screen() {
    // A surface container using the 'background' color from the theme
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Greeting("Android")
        Goodby("Programmer")
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun Goodby(name: String) {
    Column(Modifier
        .padding(50.dp)
    ) {
        Text(text = "By $name!")
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyMentoringTheme {
        Screen()
    }
}