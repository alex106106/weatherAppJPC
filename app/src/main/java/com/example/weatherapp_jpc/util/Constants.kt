package com.example.weatherapp_jpc.util


class Constants {
    companion object{
        const val BASE_URL = "https://api.openweathermap.org/data/2.5/"
        const val WEATHER_ENDPOINT = "weather?q=ciudad%20de%20mexico,%20mx&units=metric&appid=6c14b1b0996b08fba26b750f804f8105"
//        const val WEATHER_ID_ENDPOINT = ""

        const val KEY_WEATHER_ID = "com.example.weatherapp_jpc.id"
    }
    object Screen{
        const val HOME_SCREEN = "home_screen"
        const val DETAIL_SCREEN = "detail_screen"
    }
}