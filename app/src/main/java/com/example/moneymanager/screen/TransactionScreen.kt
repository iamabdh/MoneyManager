package com.example.moneymanager.screen

import android.media.RouteDiscoveryPreference
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
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
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.FractionalThreshold
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.rememberSwipeableState
import androidx.compose.material.swipeable
import androidx.compose.runtime.Composable
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
import com.example.moneymanager.ui.theme.AliceBlue
import com.example.moneymanager.ui.theme.AntiqueWhite
import com.example.moneymanager.ui.theme.Archivo
import com.example.moneymanager.ui.theme.CaribbeanGreen
import com.example.moneymanager.ui.theme.CelticBlue
import com.example.moneymanager.ui.theme.Diamond
import com.example.moneymanager.ui.theme.LightCobaltBlue
import com.example.moneymanager.ui.theme.Ming
import com.example.moneymanager.ui.theme.PalatinateBlue
import com.example.moneymanager.ui.theme.RocketMetallic
import kotlin.math.roundToInt


enum class States {
    EXPAND, COLLAPSE
}
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun TransactionScreen(
    navController: NavController
) {
    val swipeableState = rememberSwipeableState(initialValue = States.COLLAPSE)
    val offset = 10.dp
    val sizePx = with(LocalDensity.current){offset.toPx()}
    val anchors = mapOf(sizePx to States.COLLAPSE, 0f to States.EXPAND)

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
        Box(
            modifier = Modifier
                .offset {
                    IntOffset(0, swipeableState.offset.value.roundToInt())
                }
                .swipeable(
                    state = swipeableState,
                    orientation = Orientation.Vertical,
                    anchors = anchors,
                    thresholds = { _, _ ->
                        FractionalThreshold(10f)
                    },
                    velocityThreshold = 40.dp
                )
        ) {
            Card(
                backgroundColor = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(20.dp))
            ) {
               Column(
                   modifier = Modifier
                       .fillMaxSize()
                       .padding(30.dp)
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
                       ) {
                           Text(
                               text = "See All",
                               fontSize = 15.sp,
                               fontFamily = Archivo,
                               color = CelticBlue,
                               modifier = Modifier.padding(horizontal = 5.dp, vertical = 5.dp)
                           )
                       }
                   }
                   Spacer(modifier = Modifier.height(20.dp))

                   Column() {
                       Row(
                           horizontalArrangement = Arrangement.SpaceBetween,
                           verticalAlignment = Alignment.CenterVertically,
                           modifier = Modifier
                               .fillMaxWidth()
                       ) {
                           Box(
                               contentAlignment = Alignment.Center,
                               modifier = Modifier
                                   .size(50.dp)
                                   .clip(shape = CircleShape)
                                   .background(CaribbeanGreen)
                           ) {
                               Icon(
                                   tint = Color.White,
                                   painter = painterResource(id = R.drawable.baseline_directions_car_filled_24),
                                   contentDescription = "",
                                   modifier = Modifier.size(30.dp)
                               )
                           }
                           Column(
                               modifier = Modifier
                                   .weight(0.1f)
                                   .padding(10.dp)
                           ) {
                               Text(
                                   text = "Car Purchase",
                                   fontSize = 16.sp,
                                   fontFamily = Archivo,
                                   color = Color.Black,
                               )
                               Text(
                                   text = "Auto Loan",
                                   fontSize = 12.sp,
                                   fontFamily = Archivo,
                                   color = RocketMetallic,
                               )
                           }
                           Text(
                               text = "-$250",
                               fontSize = 15.sp,
                               fontFamily = Archivo,
                               color = Color.Black
                           )
                       }
                   }
               }
            }
        }
    }
}