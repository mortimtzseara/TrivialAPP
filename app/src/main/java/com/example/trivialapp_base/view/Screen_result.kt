package com.example.trivialapp_base.view

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.trivialapp_base.R
import com.example.trivialapp_base.viewmodel.GameViewModel

@Composable
fun ResultScreen(navController: NavController, viewModel: GameViewModel) {
    val resultFont = FontFamily(
        Font(R.font.result_font)
    )
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
        .fillMaxSize()
        .background(Color.White)){
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("${viewModel.puntuacion} Pts",
                fontFamily = resultFont,
                fontSize = 50.sp)
            Spacer(modifier = Modifier.padding(15.dp))
            Button(
                modifier = Modifier.width(150.dp),
                onClick = { navController.navigate("Screen_menu") }
            ) {
                Text(text = "Volver a jugar")
            }
            Spacer(modifier = Modifier.padding(5.dp))
            Button(
                modifier = Modifier.width(150.dp),
                onClick = { navController.navigate("Screen_result") }
            ) {
                Text(text = "Share")
            }
        }
    }

}