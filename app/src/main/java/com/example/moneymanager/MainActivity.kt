package com.example.moneymanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.moneymanager.components.MainHomeUserImage
import com.example.moneymanager.navigation.Navigation
import com.example.moneymanager.screen.HomeScreen
import com.example.moneymanager.ui.theme.MoneyManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MoneyManagerTheme {
                Navigation()
            }
        }
    }
}
