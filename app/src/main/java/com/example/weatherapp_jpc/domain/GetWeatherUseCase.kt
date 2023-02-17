package com.example.weatherapp_jpc.domain

import com.example.weatherapp_jpc.domain.items.WeatherItems
import com.example.weatherapp_jpc.repo.WeatherRepository
import javax.inject.Inject

class GetWeatherUseCase @Inject constructor(val weatherRepository: WeatherRepository){
    suspend operator fun invoke(id: Int): WeatherItems{
        return weatherRepository.getWeather(id)
    }
}