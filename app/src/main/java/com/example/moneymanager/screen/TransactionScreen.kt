package com.example.moneymanager.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.moneymanager.R
import com.example.moneymanager.components.TransactionBanner
import com.example.moneymanager.ui.theme.AntiqueWhite
import com.example.moneymanager.ui.theme.Archivo
import com.example.moneymanager.ui.theme.Diamond
import com.example.moneymanager.ui.theme.LightCobaltBlue
import com.example.moneymanager.ui.theme.Ming
import com.example.moneymanager.ui.theme.PalatinateBlue

@Composable
fun TransactionScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PalatinateBlue)
    ) {
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
}