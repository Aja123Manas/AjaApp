package com.example.AjoyaApp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



class AssignmentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Form()
        }
    }
}

@Composable
fun Form(){
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .paint(
                painterResource(id = R.drawable.img_3),
                contentScale = ContentScale.FillBounds
            ))
    {
        val mContext = LocalContext.current


        var koda by remember { mutableStateOf("") }
        var lola by remember { mutableStateOf("") }
        var frankie by remember { mutableStateOf("") }
        var nox by remember { mutableStateOf("") }
        var faye by remember { mutableStateOf("") }
        var bella by remember { mutableStateOf("") }
        var moana by remember { mutableStateOf("") }
        var tzeitel by remember { mutableStateOf("") }


        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
Row {
    Image(painter = painterResource(id = R.drawable.dogm),
        contentDescription ="" ,)

    Text(
        text = "Woof",
        fontSize = 60.sp,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.ExtraBold)


}
        }

        Spacer(modifier = Modifier.height(10. dp))
        TextField(
            value = koda,
            onValueChange ={ koda = it},
            placeholder = { Column {
                Text(text = "Koda", fontWeight = FontWeight.ExtraBold)
                Text(text = "2 years old")
            }},
            leadingIcon = { Image(painter = painterResource(id = R.drawable.dog2), contentDescription ="" ,
            modifier = Modifier
                .clip(shape = CircleShape)
                .size(30.dp))},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = lola,
            onValueChange ={ lola = it},
            placeholder = { Column {
                Text(text = "Lola", fontWeight = FontWeight.ExtraBold)
                Text(text = "16 years old")
            }},
            leadingIcon = { Image(painter = painterResource(id = R.drawable.dog1), contentDescription ="" ,
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(30.dp))},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(10.dp))


        TextField(
            value = frankie,
            onValueChange ={ frankie = it},
            placeholder = { Column {
                Text(text = "Frankie", fontWeight = FontWeight.ExtraBold)
                Text(text = "2 years old")
            }},
            leadingIcon = { Image(painter = painterResource(id = R.drawable.dog3), contentDescription ="" ,
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(30.dp))},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = nox,
            onValueChange ={ nox = it},
            placeholder = { Column {
                Text(text = "Nox", fontWeight = FontWeight.ExtraBold)
                Text(text = "8 years old")
            }},
            leadingIcon = { Image(painter = painterResource(id = R.drawable.dog5), contentDescription ="" ,
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(30.dp))},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(10.dp))



        TextField(
            value = faye,
            onValueChange ={ faye = it},
            placeholder = { Column {
                Text(text = "Faya", fontWeight = FontWeight.ExtraBold)
                Text(text = "8 years old")
            }},
            leadingIcon = {Image(painter = painterResource(id = R.drawable.dog6), contentDescription =""  ,
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(30.dp))},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = bella,
            onValueChange ={ bella= it},
            placeholder = { Column {
                Text(text = "Bella", fontWeight = FontWeight.ExtraBold)
                Text(text = "14 years old")
            }},
            leadingIcon = { Image(painter = painterResource(id = R.drawable.dog2), contentDescription ="" ,
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(30.dp))},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(10.dp))



        TextField(
            value = moana,
            onValueChange ={ moana = it},
            placeholder = { Column {
                Text(text = "Moana", fontWeight = FontWeight.ExtraBold)
                Text(text = "2 years old")
            }},
            leadingIcon = { Image(painter = painterResource(id = R.drawable.dog1), contentDescription ="" ,
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(30.dp))},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(10.dp))


        TextField(
            value = tzeitel,
            onValueChange ={ tzeitel = it},
            placeholder = { Column {
                Text(text = "Tzeitel", fontWeight = FontWeight.ExtraBold)
                Text(text = "7 years old")
            }},
            leadingIcon = { Image(painter = painterResource(id = R.drawable.dog3), contentDescription ="" ,
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(30.dp))},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(10.dp))






    }
}

@Preview(showBackground = true)
@Composable
fun FormPreview(){
    Form()


}