package com.example.weatherapp_jpc.data.remote

import com.example.weatherapp_jpc.data.remote.models.weatherModel
import com.example.weatherapp_jpc.util.Constants.Companion.WEATHER_ENDPOINT
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET(WEATHER_ENDPOINT)
//    suspend fun  getWeather(): Response<List<weatherModel>>
    suspend fun getWeatherById(@Query(value = "id")id: Int): Response<weatherModel>


}