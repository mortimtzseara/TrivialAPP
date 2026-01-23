package com.example.trivialapp_base.view

import com.example.trivialapp_base.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.trivialapp_base.viewmodel.GameViewModel
import androidx.compose.ui.unit.sp

@Composable
fun GameScreen(navController: NavController, viewModel: GameViewModel) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(R.drawable.logo_trivial),
                contentDescription = "Logo",
                Modifier.size(50.dp)
            )
            Text(
                text = "Pregunta ${viewModel.indicePreguntaActual + 1}",
                fontSize = 40.sp
            )
            HorizontalDivider()
            Text(
                textAlign = TextAlign.Center,
                text = "${viewModel.preguntaActual?.pregunta}",
                fontSize = 25.sp
            )
            Row(modifier = Modifier.padding(10.dp, top = 50.dp)) {
                Button(
                    modifier = Modifier
                        .padding(5.dp)
                        .width(155.dp)
                        .height(100.dp),
                    onClick = {
                        viewModel.responderPregunta(viewModel.respuestasMezcladas[0])
                        if(viewModel.juegoTerminado) navController.navigate("Screen_result")
                    }
                ) {
                    Text(
                        viewModel.respuestasMezcladas[0],
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center
                    )
                }
                Button(
                    modifier = Modifier
                        .padding(5.dp)
                        .width(155.dp)
                        .height(100.dp),
                    onClick = {
                        viewModel.responderPregunta(viewModel.respuestasMezcladas[1])
                        if(viewModel.juegoTerminado) navController.navigate("Screen_result")
                    }
                ) {
                    Text(
                        viewModel.respuestasMezcladas[1],
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Row(modifier = Modifier.padding(6.dp)) {
                Button(
                    modifier = Modifier
                        .padding(5.dp)
                        .width(155.dp)
                        .height(100.dp),
                    onClick = {
                        viewModel.responderPregunta(viewModel.respuestasMezcladas[2])
                        if(viewModel.juegoTerminado) navController.navigate("Screen_result")
                    }
                ) {
                    Text(
                        viewModel.respuestasMezcladas[2],
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center
                    )
                }
                Button(
                    modifier = Modifier
                        .padding(5.dp)
                        .width(155.dp)
                        .height(100.dp),
                    onClick = {
                        viewModel.responderPregunta(viewModel.respuestasMezcladas[3])
                        if(viewModel.juegoTerminado) navController.navigate("Screen_result")
                    }
                ) {
                    Text(
                        viewModel.respuestasMezcladas[3],
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }

            LinearProgressIndicator(
                progress = {viewModel.tiempoRestante}
            )
            if(viewModel.juegoTerminado) navController.navigate("Screen_result")
        }

    }