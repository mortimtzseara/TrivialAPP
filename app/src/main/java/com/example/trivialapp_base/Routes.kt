package com.example.trivialapp_base

sealed class Routes(val route: String) {
    object Screengame:Routes("Screen_game")
    object Screenmenu:Routes("Screen_menu")
    object Screenresult:Routes("Screen_result")
    object Screensplash:Routes("Screen_splash")
}