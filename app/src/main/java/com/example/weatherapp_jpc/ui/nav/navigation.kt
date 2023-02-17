package com.example.weatherapp_jpc.ui.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.weatherapp_jpc.ui.screens.DetailScreen
import com.example.weatherapp_jpc.ui.screens.HomeScreen
import com.example.weatherapp_jpc.ui.viewModel.WeatherViewModel
import com.example.weatherapp_jpc.util.Constants.Companion.KEY_WEATHER_ID
import com.example.weatherapp_jpc.util.Constants.Screen.DETAIL_SCREEN
import com.example.weatherapp_jpc.util.Constants.Screen.HOME_SCREEN

sealed class Screen(val route: String){
    object Home: Screen(route = HOME_SCREEN)
    object Detail: Screen(route = DETAIL_SCREEN)
}

@Composable
fun SetupNav(navController: NavHostController, weatherViewModel: WeatherViewModel) {
    NavHost(navController = navController, startDestination = Screen.Home.route ){
        composable(route = Screen.Home.route){
            HomeScreen(navController = navController)
        }
        composable(route = Screen.Detail.route){backStackEntry ->
            DetailScreen(id = backStackEntry.arguments?.getString(KEY_WEATHER_ID) ?: "1",weatherViewModel = weatherViewModel, navController = navController)
        }
    }
}