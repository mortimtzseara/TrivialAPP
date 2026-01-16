package com.example.trivialapp_base.view

import androidx.compose.foundation.Image
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import androidx.core.R
import androidx.navigation.NavController
import com.example.trivialapp_base.viewmodel.GameViewModel

@Composable
fun SplashScreen(navController: NavController, myViewModel: GameViewModel) {
    Text("TRIVIAL",
    color = Color.Green,
    fontSize = 30.sp,
    fontFamily = FontFamily.SansSerif
        )
    Image(
        painter = painterResource(id = R.drawable.logo_trivial),
        contentDescription = "logo trivial",
        alpha = 0.5f
    )
}