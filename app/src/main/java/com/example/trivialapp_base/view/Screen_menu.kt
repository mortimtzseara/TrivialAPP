package com.example.trivialapp_base.view

import com.example.trivialapp_base.R
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.trivialapp_base.viewmodel.GameViewModel
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MenuScreen(navController: NavController, viewModel: GameViewModel) {

    val titleFont = FontFamily(
        Font(R.font.title_font)
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "TRIVIAL",
                fontSize = 30.sp,
                fontFamily = titleFont
            )
            Image(
                painter = painterResource(R.drawable.logo_trivial),
                contentDescription = "Logo",
                Modifier.padding(20.dp)
            )
            DropdownMenu(viewModel)
            Button(
                modifier = Modifier.width(150.dp),
                onClick = { navController.navigate("Screen_game")
                viewModel.iniciarJuego() }
            ) {
                Text(text = "Empezar")
            }
        }
    }
}

@Composable
fun DropdownMenu(viewModel: GameViewModel){
    var expanded by remember {mutableStateOf(false)}
    val difficulties = listOf("Facil", "Medio", "Dificil")

    Column(Modifier.padding(20.dp)){
        OutlinedTextField(
            value = viewModel.dificultadSeleccionada,
            onValueChange = { viewModel.dificultadSeleccionada},
            enabled = false,
            readOnly = true,
            modifier = Modifier
                .clickable { expanded = true }
                .width(250.dp)
        )
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.width(250.dp)
        ) {
            difficulties.forEach { difficulty ->
                DropdownMenuItem(text = { Text(text = difficulty) },
                    onClick = {
                        expanded = false
                        viewModel.setDificultad(difficulty)
                    })
            }
        }

    }
}