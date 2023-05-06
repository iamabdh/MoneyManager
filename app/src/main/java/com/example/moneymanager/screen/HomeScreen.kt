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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
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
import com.example.moneymanager.ui.theme.*


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
        Spacer(modifier = Modifier.height(20.dp))
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .size(150.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(CaribbeanGreen)
            ) {
                Box(
                    modifier = Modifier
                        .offset(x = 50.dp, y = (-40).dp)
                        .size(100.dp)
                        .background(White15, CircleShape)
                )
                Box(
                    modifier = Modifier
                        .offset(x = 100.dp)
                        .size(100.dp)
                        .background(White15, CircleShape)
                )
                Box(
                    modifier = Modifier
                        .offset(x = 10.dp, y = 40.dp)
                        .size(100.dp)
                ) {
                    Column() {
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .size(40.dp)
                                .background(Color.White, CircleShape)
                        ) {
                            Box(
                                contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .size(30.dp)
                                    .background(CaribbeanGreen, CircleShape)
                            ) {
                                Image(painter = painterResource(id = R.drawable.baseline_attach_money_24), contentDescription = "")
                            }
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(text = "Transactions", fontSize = 15.sp, color = White80)
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(text = "7 items", fontSize = 9.sp, color = White80)
                    }
                }
            }
        }
    }
}