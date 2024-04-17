package com.example.AjoyaApp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout() {
    Column(modifier = Modifier.fillMaxSize()) {

        val mContext = LocalContext.current
        //TopAppBar
        TopAppBar(
            title = {
                Text(
                    text = "Homescreen",
                    color = Color.White
                )
            },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Gray),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext,IntentActivity::class.java))
                }
                )
                {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Arrow Back",
                        tint = Color.White
                    )
                }

            },

            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "share",
                        tint = Color.White
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "settings",
                        tint = Color.White
                    )
                }
            }
        )

        //End of TopAppBar
        Text(
            text = "DESTINATIONS",
            fontSize = 30.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.Cursive
        )

        //First Row
        Row {
            Image(
                painter = painterResource(id = R.drawable.ho2),
                contentDescription = "Dubai",
                modifier = Modifier.size(width = 200.dp, height = 200.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))

            Column {

                Text(text = "Dubai", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                Text(text = "Here are some best places to visit in Kenya: Read more. Image description. Bigger Group? Get special offers upto 50% off! We create unforgettable adventures ...")
            }
        }
        Row {
            Image(
                painter = painterResource(id = R.drawable.mountain),
                contentDescription = "Mt.Kenya",
                modifier = Modifier.size(width = 200.dp, height = 200.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Text(text = "Kenya", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                Text(text = "Here are some best places to visit in Kenya: Read more. Image description. Bigger Group? Get special offers upto 50% off! We create unforgettable adventures ...")
            }
        }

        Row {
            Image(
                painter = painterResource(id = R.drawable.colour),
                contentDescription = "Newzealand",
                modifier = Modifier.size(width = 200.dp, height = 200.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Text(text = "Newzealand", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                Text(text = "Here are some best places to visit in Kenya: Read more. Image description. Bigger Group? Get special offers upto 50% off! We create unforgettable adventures ...")
            }
        }

        //End of Row

        Spacer(modifier = Modifier.height(50.dp))
        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color.Cyan),
            modifier = Modifier
                .fillMaxWidth()

        ) {
            Text(text = "Next")
        }
    }
}
@Preview(showBackground = true)
@Composable
  fun LayoutPreview() {
    Layout()
}
