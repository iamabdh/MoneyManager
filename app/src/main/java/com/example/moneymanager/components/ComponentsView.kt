package com.example.moneymanager.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.moneymanager.R
import com.example.moneymanager.ui.theme.AliceBlue

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