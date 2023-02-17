package com.example.weatherapp_jpc.data.remote

import com.example.weatherapp_jpc.data.remote.models.weatherModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class WeatherService @Inject constructor(private val WeatherApi: WeatherApi){
    suspend fun getWeather(id: Int): weatherModel{
        return withContext(Dispatchers.IO){
            val weather = WeatherApi.getWeatherById(id)
            weather.body()!!
        }
    }
}