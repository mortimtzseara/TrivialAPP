package com.example.trivialapp_base

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.navigation.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.trivialapp_base.ui.theme.TrivialAPP_BaseTheme
import com.example.trivialapp_base.viewmodel.GameViewModel
import com.example.trivialapp_base.view.GameScreen
import com.example.trivialapp_base.view.MenuScreen
import com.example.trivialapp_base.view.ResultScreen
import com.example.trivialapp_base.view.SplashScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TrivialAPP_BaseTheme {
                // Controlador de navegación

                val navigationController = rememberNavController()
                val myViewModel by viewModels<GameViewModel>()

                NavHost(
                    navController = navigationController,
                    startDestination = Routes.Screensplash.route
                ){
                    composable(Routes.Screengame.route) {GameScreen(navigationController, myViewModel) }
                    composable(Routes.Screenmenu.route) {MenuScreen(navigationController, myViewModel)}
                    composable(Routes.Screenresult.route) {ResultScreen(navigationController, myViewModel)}
                    composable(Routes.Screensplash.route) {SplashScreen(navigationController, myViewModel)}
                }

                // Instanciamos el ViewModel una vez



                // Definición de rutas y navegación



            }
        }
    }
}

