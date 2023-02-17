package com.example.weatherapp_jpc.repo

import com.example.weatherapp_jpc.data.remote.WeatherService
import com.example.weatherapp_jpc.domain.items.WeatherItems
import com.example.weatherapp_jpc.domain.items.toWeatherItems
import java.net.IDN
import javax.inject.Inject

class WeatherRepository @Inject constructor(private  val weatherService: WeatherService) {
    suspend fun getWeather(id: Int): WeatherItems{
        return weatherService.getWeather(id).toWeatherItems()

    }

}