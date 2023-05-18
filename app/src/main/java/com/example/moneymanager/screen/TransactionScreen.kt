package com.example.moneymanager.screen

import android.media.RouteDiscoveryPreference
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.overscroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.FractionalThreshold
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.rememberSwipeableState
import androidx.compose.material.swipeable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.moneymanager.R
import com.example.moneymanager.components.TransactionBanner
import com.example.moneymanager.components.TransactionItemView
import com.example.moneymanager.ui.theme.AliceBlue
import com.example.moneymanager.ui.theme.AntiqueWhite
import com.example.moneymanager.ui.theme.Archivo
import com.example.moneymanager.ui.theme.CaribbeanGreen
import com.example.moneymanager.ui.theme.CelticBlue
import com.example.moneymanager.ui.theme.Crayola
import com.example.moneymanager.ui.theme.Diamond
import com.example.moneymanager.ui.theme.LightCobaltBlue
import com.example.moneymanager.ui.theme.Ming
import com.example.moneymanager.ui.theme.PalatinateBlue
import com.example.moneymanager.ui.theme.RocketMetallic
import com.example.moneymanager.ui.theme.TiffanyBlue
import kotlinx.coroutines.delay
import kotlin.math.roundToInt


enum class States {
    EXPAND, COLLAPSE
}
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun TransactionScreen(
    navController: NavController
) {
    val scrollState = rememberScrollState()
    var expanded by remember { mutableStateOf(false) }

    val expandHeight by animateDpAsState(targetValue = if (expanded) 100.dp else 40.dp)

    LaunchedEffect(scrollState) {
        snapshotFlow { scrollState.value }
            .collect { value ->
                expanded = value > 0
                println(expandHeight)

            }
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PalatinateBlue)
    ) {
        Column() {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                Icon(
                    tint = Color.White,
                    painter = painterResource(id = R.drawable.baseline_arrow_back_ios_24),
                    contentDescription = "",
                    modifier = Modifier.size(30.dp)
                )
                Icon(
                    tint = Color.White,
                    painter = painterResource(id = R.drawable.baseline_history_24),
                    contentDescription = "",
                    modifier = Modifier.size(35.dp)
                )
            }

            Spacer(modifier = Modifier.height(30.dp))

            Column(
                modifier = Modifier.padding(start = 30.dp)
            ) {
                Text(
                    text = "Your Balance",
                    fontSize = 30.sp,
                    fontFamily = Archivo,
                    color = LightCobaltBlue
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "$ 2909.00",
                    fontSize = 30.sp,
                    fontFamily = Archivo,
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                horizontalArrangement = Arrangement.spacedBy(20.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 40.dp)
            ) {
                TransactionBanner(
                    imageBanner = R.drawable.money_removebg_preview,
                    amount = 500.00f,
                    colorBanner = Diamond,
                    nameBanner = "Expense"
                )

                TransactionBanner(
                    imageBanner = R.drawable.piggy_bank_colored,
                    amount = 500.00f,
                    colorBanner = AntiqueWhite,
                    nameBanner = "Spend to Goals"
                )

            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(expandHeight)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(Color.White)
        ) {
            Box(

            ) {
               Column(
                   modifier = Modifier
                       .fillMaxSize()
                       .padding(30.dp)
                       .verticalScroll(scrollState)
               ) {
                   Row(
                       horizontalArrangement = Arrangement.SpaceBetween,
                       verticalAlignment = Alignment.CenterVertically,
                       modifier = Modifier
                           .fillMaxWidth()
                   ) {
                       Text(
                           text = "Transactions",
                           fontSize = 20.sp,
                           fontFamily = Archivo,
                           color = Color.Black,
                       )
                       Box(
                           contentAlignment = Alignment.Center,
                           modifier = Modifier
                               .clip(shape = RoundedCornerShape(10.dp))
                               .background(AliceBlue)
                               .clickable { expanded = !expanded }
                       ) {
                           Text(
                               text = "See All",
                               fontSize = 15.sp,
                               fontFamily = Archivo,
                               color = CelticBlue,
                               modifier = Modifier
                                   .padding(horizontal = 5.dp, vertical = 5.dp)
                           )
                       }
                   }
                   Spacer(modifier = Modifier.height(20.dp))

                   Column(
                       verticalArrangement = Arrangement.spacedBy(5.dp)
                   ) {
                       TransactionItemView(
                           iconItem = R.drawable.baseline_directions_car_filled_24,
                           iconColor = CaribbeanGreen,
                           itemTypeName = "Car Purchase",
                           itemListTransaction = "Auto Loan" ,
                           itemTransactionAmount = 250,
                       )
                       TransactionItemView(
                           iconItem = R.drawable.baseline_home_24,
                           iconColor = PalatinateBlue,
                           itemTypeName = "House Purchase",
                           itemListTransaction = "Airbnb Home" ,
                           itemTransactionAmount = 250,
                       )
                       TransactionItemView(
                           iconItem = R.drawable.baseline_local_florist_24,
                           iconColor = Crayola,
                           itemTypeName = "Transport",
                           itemListTransaction = "Uber, Gas" ,
                           itemTransactionAmount = 250,
                       )
                       TransactionItemView(
                           iconItem = R.drawable.baseline_shopping_bag_24,
                           iconColor = TiffanyBlue,
                           itemTypeName = "Shopping",
                           itemListTransaction = "Wish, Apple" ,
                           itemTransactionAmount = 250,
                       )
                   }
               }
            }
        }
    }
}