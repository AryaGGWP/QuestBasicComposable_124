package com.example.pertemuan_3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pertemuan_3.ui.theme.Pertemuan_3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pertemuan_3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(
                        arya = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BasicCompose(arya: Modifier = Modifier){
    Column(verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(text = "Login",
            fontSize = 50.sp, color = Color.Black,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Ini adalah Halaman Login", modifier = arya,
            fontSize = 15.sp, color = Color.Gray)

        Spacer(modifier = Modifier.height(16.dp))

        Image(painter = painterResource(id = R.drawable.umy),
            contentDescription = null,
            modifier = arya.size(150.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Nama",
            fontSize = 20.sp, color = Color.Black,
            fontWeight = FontWeight.Bold
        )

        Text(text = "Arya Dio Fenanto",
            fontSize = 30.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold

        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "20220140124",
            fontSize = 26.sp,
            color = Color.Black)
        

        Image(painter = painterResource(id = R.drawable.fifa),
            contentDescription = null,
            modifier = arya.size(200.dp))
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Pertemuan_3Theme {
        Greeting("Android")
    }
}