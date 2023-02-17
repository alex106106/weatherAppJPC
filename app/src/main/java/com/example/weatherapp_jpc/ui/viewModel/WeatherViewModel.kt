package com.example.weatherapp_jpc.ui.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapp_jpc.domain.GetWeatherUseCase
import com.example.weatherapp_jpc.domain.items.WeatherItems
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val getWeatherUseCase: GetWeatherUseCase): ViewModel(){

        private val _weather = MutableLiveData<WeatherItems>()
        val weather: LiveData<WeatherItems>get() = _weather


    fun getWeatherById(id: Int){
        viewModelScope.launch {
            try {
                val game = getWeatherUseCase(id)
                _weather.value = game
            }catch (_: Exception){}
        }
    }
//    init {
//        getWeather()
//    }
//
//    private fun getWeather() {
//        viewModelScope.launch {
//            try {
//                val weather = getWeatherUseCase()
//                _weather.value = weather
//            }catch (_: Exception){}
//        }
//    }
}