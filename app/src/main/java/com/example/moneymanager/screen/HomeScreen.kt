package com.example.moneymanager.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moneymanager.R
import com.example.moneymanager.components.MainHomeMenu
import com.example.moneymanager.components.MainHomeUserImage
import com.example.moneymanager.ui.theme.AliceBlue
import com.example.moneymanager.ui.theme.AliceBlue1
import com.example.moneymanager.ui.theme.Archivo
import com.example.moneymanager.ui.theme.DavysGrey
import com.example.moneymanager.ui.theme.SpanishGray


@Composable
fun HomeScreen() {
    Column() {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            MainHomeMenu()
            MainHomeUserImage()
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp, top = 40.dp)
        ) {
            Text(text = "Welcome Back", fontSize = 22.sp, fontFamily = Archivo, color = DavysGrey)
            Spacer(modifier = Modifier.height(3.dp))
            Text(text = "Creative Mints", fontSize = 26.sp, fontFamily = Archivo, fontWeight = FontWeight.Medium)
        }
        Spacer(modifier = Modifier.height(30.dp))
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            TextField(
                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_search_24),
                        contentDescription = ""
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Transparent,
                    focusedLabelColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    backgroundColor = Color.Transparent

                ),
                label = {Text("Search", fontSize = 13.sp, color = SpanishGray, fontFamily = Archivo, fontWeight = FontWeight.Normal, modifier = Modifier.offset(y = 3.dp))},
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .fillMaxWidth(0.8f)
                    .background(AliceBlue1)
                    .height(60.dp),
                value = "",
                onValueChange = {},
            )
        }
    }
}