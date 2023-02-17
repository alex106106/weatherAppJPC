package com.example.weatherapp_jpc.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.weatherapp_jpc.data.remote.WeatherApi
import com.example.weatherapp_jpc.data.remote.WeatherService
import com.example.weatherapp_jpc.domain.GetWeatherUseCase
import com.example.weatherapp_jpc.repo.WeatherRepository
import com.example.weatherapp_jpc.ui.nav.SetupNav
import com.example.weatherapp_jpc.ui.screens.HomeScreen
import com.example.weatherapp_jpc.ui.theme.WeatherAppJPCTheme
import com.example.weatherapp_jpc.ui.viewModel.WeatherViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppJPCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background,
                ){
                    val navController = rememberNavController()
                    SetupNav(navController = navController, weatherViewModel = viewModel())
                }
            }
        }
    }
}

