package com.example.ajaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ajaapp.ui.theme.AjaAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo()





        }
    }
}

@Composable
fun Demo(){
 Column(modifier = Modifier.fillMaxSize()) {
     Text(
         text = "Welcome to Android",
         fontSize = 30.sp,
         color = Color.Red,
         fontWeight = FontWeight.Bold,
         fontStyle = FontStyle.Italic,
         textDecoration = TextDecoration.Underline)
     Text(text = "Android software development is the process by which applications are created for devices running the Android operating system. Google states that \"Android ...\n" +
             "\u200EOfficial development tools · \u200EAndroid Developer Challenge · \u200EJava standards\n" +
             "\n")


     Text(text = "Types of Cars",
         fontSize = 20.sp,
         modifier = Modifier
             .fillMaxWidth()
             .background(Color.Cyan)
             .height(40.dp)
         ,
         textAlign = TextAlign.Center,
         color = Color.White,
         fontWeight = FontWeight.Bold)
     Text(text = "1.Subaru")
     Text(text = "2.Mercedes Benz")
     Text(text = "3.Audi")
     Text(text = "4.Mazda")


     Text(text = "Types of Androids",
         fontSize = 20.sp,
         modifier = Modifier
             .fillMaxWidth()
             .background(Color.Gray)
             .height(40.dp)
         ,
       textAlign = TextAlign.Center,
         color = Color.White,
         fontWeight = FontWeight.Bold)
     Text(text = "1.Smart Phones")
     Text(text = "2.Smart Watches")
     Text(text = "3.Tablets")
     Text(text = "4.Laptops")




     Text(text = "Types of Programming Languages",
         fontSize = 20.sp,
         modifier = Modifier
             .fillMaxWidth()
             .background(Color.Magenta)
             .height(40.dp)
         ,
         textAlign = TextAlign.Center,
         color = Color.White,
         fontWeight = FontWeight.Bold)
     Text(text = "1.Python")
     Text(text = "2.C++")
     Text(text = "3.JavaScript")
     Text(text = "4.Kotlin")



     Text(text = "Types of Computer Packages",
         fontSize = 20.sp,
         modifier = Modifier
             .fillMaxWidth()
             .background(Color.Red)
             .height(40.dp)
         ,
         textAlign = TextAlign.Center,
         color = Color.White,
         fontWeight = FontWeight.Bold)
     Text(text = "1.DataBase")
     Text(text = "2.Excel")
     Text(text = "3.Word Processor")
     Text(text = "4.Publisher")



 }
}
@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    Demo()
}