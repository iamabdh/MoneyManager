package com.example.moneymanager.components

import android.graphics.drawable.Drawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moneymanager.R
import com.example.moneymanager.ui.theme.AliceBlue
import com.example.moneymanager.ui.theme.AliceBlue1
import com.example.moneymanager.ui.theme.Archivo
import com.example.moneymanager.ui.theme.BrightGray
import com.example.moneymanager.ui.theme.CaribbeanGreen
import com.example.moneymanager.ui.theme.Diamond
import com.example.moneymanager.ui.theme.Ming
import com.example.moneymanager.ui.theme.SkyBlue
import com.example.moneymanager.ui.theme.SpanishGray
import com.example.moneymanager.ui.theme.White15
import com.example.moneymanager.ui.theme.White80
import org.w3c.dom.Text

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
    nameFontSize: TextUnit = 15.sp,
    noItems: Int,
    colorBanner: Color,
    bannerIcon: Int,
    onClickGoTo: () -> Unit
) {
    Box(
        modifier = Modifier
            .size(150.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(colorBanner)
            .clickable {
                onClickGoTo()
            }
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
                        .size(45.dp)
                        .background(Color.White, CircleShape)
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .size(35.dp)
                            .background(colorBanner, CircleShape)
                    ) {
                        Image(painter = painterResource(id = bannerIcon), contentDescription = "")
                    }
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = nameBanner, fontSize = nameFontSize, color = White80)
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "$noItems items", fontSize = 9.sp, color = White80)
            }
        }
    }
}


@Composable
fun ServicesBannerHome(
    t1: String,
    t2: String,
    colorBanner: Color,
    iconBanner: Int,
) {
    Box(
        modifier = Modifier
            .clip(shape = RoundedCornerShape(20.dp))
            .border(1.dp, shape = RoundedCornerShape(20.dp), color = BrightGray)
            .clickable { }
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(5.dp),
            modifier = Modifier.padding(vertical = 10.dp, horizontal = 10.dp)
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(40.dp)
                    .clip(shape = CircleShape)
                    .background(colorBanner)
            ) {
                Icon(
                    tint = Color.White,
                    painter = painterResource(id = iconBanner),
                    contentDescription = "")
            }
            Column(
                modifier = Modifier.padding(end = 30.dp)
            ) {
                Text(
                    text = t1,
                    fontSize = 15.sp,
                    fontFamily = Archivo
                )
                Text(
                    text = t2,
                    fontSize = 15.sp,
                    fontFamily = Archivo,
                    modifier = Modifier.offset(y= (-5).dp)
                )
            }
        }
    }
}


@Composable
fun TransactionBanner(
    imageBanner: Int,
    amount: Float,
    colorBanner: Color,
    nameBanner: String
) {
    Box(
        modifier = Modifier
            .width(155.dp)
            .height(170.dp)
            .clip(shape = RoundedCornerShape(20.dp))
            .background(colorBanner)
            .clickable {  }
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 20.dp, top = 30.dp, bottom = 20.dp)
        ) {
            Image(
                painter = painterResource(id = imageBanner),
                contentDescription = "",
                modifier = Modifier
                    .size(62.dp)
            )
            Text(
                text = "$ $amount",
                fontSize = 20.sp,
                fontFamily = Archivo,
                color = Color.Black
            )
            Text(
                text = nameBanner,
                fontSize = 15.sp,
                fontFamily = Archivo,
                color = Ming
            )
        }
    }
}