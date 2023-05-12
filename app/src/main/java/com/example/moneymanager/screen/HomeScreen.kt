package com.example.moneymanager.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
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
import com.example.moneymanager.components.HomeBannerButtons
import com.example.moneymanager.components.MainHomeMenu
import com.example.moneymanager.components.MainHomeUserImage
import com.example.moneymanager.components.SearchTextField
import com.example.moneymanager.ui.theme.*


@Composable
fun HomeScreen() {
    Column {
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
        SearchTextField()
        Spacer(modifier = Modifier.height(20.dp))
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(
                start = 12.dp,
                top = 16.dp,
                end = 12.dp,
                bottom = 16.dp
            ),
            horizontalArrangement = Arrangement.Center,
        ) {
           item {
               Box(
                   contentAlignment = Alignment.Center,
               ) {
                   HomeBannerButtons(
                       nameBanner = "Transcation",
                       noItems = 7,
                       colorBanner = CaribbeanGreen ,
                       bannerIcon = R.drawable.baseline_attach_money_24
                   )
               }
           }
            item {
                Box(
                ) {
                    HomeBannerButtons(
                        nameBanner = "Buggets",
                        noItems = 7,
                        colorBanner = Crayola ,
                        bannerIcon = R.drawable.piggy_bank
                    )
                }
            }
            item {
                Box(
                    contentAlignment = Alignment.Center,
                ) {
                    HomeBannerButtons(
                        nameBanner = "Recomendations",
                        noItems = 7,
                        colorBanner = MaximumYellowRed ,
                        bannerIcon = R.drawable.baseline_star_border_24
                    )
                }
            }

            item {
                Box(
                ) {
                    HomeBannerButtons(
                        nameBanner = "Credit Card",
                        noItems = 7,
                        colorBanner = PalatinateBlue ,
                        bannerIcon = R.drawable.purchase
                    )
                }
            }
        }
    }
}