package com.example.moneymanager.components

import android.graphics.drawable.Drawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import com.example.moneymanager.ui.theme.AliceBlue
import com.example.moneymanager.ui.theme.AliceBlue1
import com.example.moneymanager.ui.theme.Archivo
import com.example.moneymanager.ui.theme.CaribbeanGreen
import com.example.moneymanager.ui.theme.SpanishGray
import com.example.moneymanager.ui.theme.White15
import com.example.moneymanager.ui.theme.White80

@Composable
fun MainHomeMenu() {
    Box(
        modifier = Modifier
            .size(40.dp)
            .background(AliceBlue, CircleShape),
        contentAlignment = Alignment.Center
    ){
        Icon(painter = painterResource(id = R.drawable.baseline_segment_24), contentDescription = "")
    }
}

@Composable
fun MainHomeUserImage() {
    Box(
        modifier = Modifier
            .size(40.dp)
            .clip(shape = CircleShape)
    ) {
        Image(painter = painterResource(id = R.drawable.image), contentDescription = "")
    }
}


@Composable
fun SearchTextField() {
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
            label = { Text(
                text = "Search",
                fontSize = 13.sp,
                color = SpanishGray,
                fontFamily = Archivo,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.offset(y = 3.dp))},
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





@Composable
fun HomeBannerButtons(
    nameBanner: String,
    noItems: Int,
    colorBanner: Color,
    bannerIcon: Int
) {
    Box(
        modifier = Modifier
            .size(150.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(colorBanner)
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
                            .background(colorBanner, CircleShape)
                    ) {
                        Image(painter = painterResource(id = bannerIcon), contentDescription = "")
                    }
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = nameBanner, fontSize = 10.sp, color = White80)
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "$noItems items", fontSize = 9.sp, color = White80)
            }
        }
    }
}