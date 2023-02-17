package com.example.weatherapp_jpc.domain.items

import com.example.weatherapp_jpc.data.remote.models.*

data class WeatherItems(
    val base: String,
    val clouds: Clouds,
    val cod: Int,
    val coord: Coord,
    val dt: Int,
    val id: Int,
    val main: Main,
    val name: String,
    val sys: Sys,
    val timezone: Int,
    val visibility: Int,
    val weather: List<Weather>,
    val wind: Wind
)

fun weatherModel.toWeatherItems() = WeatherItems(base, clouds, cod, coord, dt, id, main, name, sys, timezone, visibility, weather, wind)