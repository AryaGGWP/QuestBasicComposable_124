package com.example.pertemuan_3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pertemuan_3.ui.theme.Pertemuan_3Theme
import androidx.compose.ui.graphics.Shape

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
    Column(verticalArrangement = Arrangement.Top,
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(text = "Login",
            fontSize = 50.sp, color = Color.Black,
            fontWeight = FontWeight.Bold
        )
        Text(text = "Ini adalah Halaman Login",
            fontSize = 15.sp, color = Color.Gray)

        Spacer(modifier = Modifier.height(5.dp))

        Image(painter = painterResource(id = R.drawable.umy),
            contentDescription = null,
            modifier = arya.size(300.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))

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

        Spacer(modifier = Modifier.height(10.dp))

        Image(painter = painterResource(id = R.drawable.yak),
            contentDescription = null,
            modifier = arya
                .size(350.dp)
                .clip(heartshape())
                .border(5.dp, Color.Blue, heartshape())
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }
}

fun heartshape(): Shape {
    return GenericShape { size, _ ->
        val width = size.width
        val height = size.height

        moveTo(width / 2, height * 0.3f)
        cubicTo(0f, 0f, 0f,height * 0.6f, width / 2, height)
        cubicTo(width, height * 0.6f, width, 0f, width / 2, height * 0.3f)
        close()
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