package com.example.ajaapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
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
 Column(


         modifier = Modifier
         .fillMaxSize()
         .paint(painterResource(id = R.drawable.background),
             contentScale = ContentScale.FillBounds))
 {
     val mContext = LocalContext.current
     Text(
         text = "Welcome to Android",
         fontSize = 30.sp,
         color = Color.Magenta,
         fontWeight = FontWeight.Bold,
         fontStyle = FontStyle.Italic,
         textDecoration = TextDecoration.Underline
     )
     Text(text = "Android software development is the process by which applications are created for devices running the Android operating system. Google states that \"Android ...\n" + "\u200EOfficial development tools ·")
     Text(
         text = "Types of Cars",
         fontSize = 20.sp,
         modifier = Modifier
             .fillMaxWidth()
             .background(Color.Cyan)
             .height(40.dp),
         textAlign = TextAlign.Center,
         color = Color.White,
         fontWeight = FontWeight.Bold
     )
     Text(text = "1.Subaru")
     Text(text = "2.Mercedes Benz")


             Text(
                 text = "Types of Androids",
                 fontSize = 20.sp,
                 modifier = Modifier
                     .fillMaxWidth()
                     .background(Color.Cyan)
                     .height(40.dp),
                 textAlign = TextAlign.Center,
                 color = Color.White,
                 fontWeight = FontWeight.Bold
             )
             Text(text = "1.Smart Phones")
             Text(text = "2.Smart Watches")

             Button(
                 onClick = { /*TODO*/ },
                 shape = RoundedCornerShape(5.dp),
                 colors = ButtonDefaults.buttonColors(Color.Cyan),
                 modifier = Modifier
                     .padding(start = 100.dp, end = 100.dp)

             )

             {
                 Text(text = "More Devices")

             }
             Divider()
             Text(
                 text = "eMobolis Mobile Training Institute",
                 fontSize = 20.sp,
                 fontWeight = FontWeight.Bold
             )

             Box(
                 modifier = Modifier.fillMaxWidth(),
                 contentAlignment = Alignment.Center
             ) {
                 Image(
                     painter = painterResource(id = R.drawable.ho2),
                     contentDescription = "hotel",
                     modifier = Modifier
                         .size(200.dp)
                         .clip(shape = CircleShape),
                     contentScale = ContentScale.Crop


                 )


             }

             Button(onClick = {
                              mContext.startActivity(Intent(mContext,LayoutActivity::class.java))
             },
                 shape = RoundedCornerShape(5.dp),
                 colors = ButtonDefaults.buttonColors(Color.Cyan),
                 modifier = Modifier
                     .fillMaxWidth()
                     .padding(start = 30.dp, end = 30.dp)
             ) {
                 Text(text = "Continue")
             }
         }
     }
     @Preview(showBackground = true)
     @Composable
     fun DemoPreview() {
         Demo()
     }
