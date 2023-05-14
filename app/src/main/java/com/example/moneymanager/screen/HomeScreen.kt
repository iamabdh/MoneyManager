package com.example.moneymanager.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import androidx.navigation.NavController
import com.example.moneymanager.R
import com.example.moneymanager.components.HomeBannerButtons
import com.example.moneymanager.components.MainHomeMenu
import com.example.moneymanager.components.MainHomeUserImage
import com.example.moneymanager.components.SearchTextField
import com.example.moneymanager.components.ServicesBannerHome
import com.example.moneymanager.ui.theme.*


@Composable
fun HomeScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier.verticalScroll(rememberScrollState())
    ) {
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
                .padding(start = 50.dp, top = 30.dp)
        ) {
            Text(text = "Welcome Back", fontSize = 22.sp, fontFamily = Archivo, color = DavysGrey)
            Spacer(modifier = Modifier.height(3.dp))
            Text(
                text = "Creative Mints",
                fontSize = 26.sp,
                fontFamily = Archivo,
                fontWeight = FontWeight.Medium
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        SearchTextField()
        Spacer(modifier = Modifier.height(20.dp))

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier.padding(10.dp)
            ) {
                HomeBannerButtons(
                            nameBanner = "Transcation",
                            noItems = 7,
                            colorBanner = CaribbeanGreen,
                            bannerIcon = R.drawable.baseline_attach_money_24
                        )
                HomeBannerButtons(
                            nameBanner = "Recomendations",
                            noItems = 7,
                            colorBanner = MaximumYellowRed,
                            bannerIcon = R.drawable.baseline_star_border_24
                        )
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier.padding(10.dp)
            ) {
                HomeBannerButtons(
                            nameBanner = "Buggets",
                            noItems = 7,
                            colorBanner = Crayola,
                            bannerIcon = R.drawable.piggy_bank
                        )
                HomeBannerButtons(
                            nameBanner = "Credit Card",
                            noItems = 7,
                            colorBanner = PalatinateBlue,
                            bannerIcon = R.drawable.purchase
                        )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp)
        ) {
            Text(
                text = "Choose a categories",
                fontSize = 20.sp,
                fontFamily = Archivo,
                fontWeight = FontWeight.Medium
            )
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                ServicesBannerHome(
                    t1 = "Branch",
                    t2 = "Service",
                    colorBanner = SkyBlue,
                    iconBanner = R.drawable.baseline_account_balance_24
                )
                ServicesBannerHome(
                    t1 = "Make a",
                    t2 = "Payment",
                    colorBanner = UltramarineBlue,
                    iconBanner = R.drawable.credit_card__1
                )
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
    }
}