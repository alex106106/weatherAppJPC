package com.example.weatherapp_jpc.di

import com.example.weatherapp_jpc.data.remote.WeatherApi
import com.example.weatherapp_jpc.util.Constants.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {
    @Singleton
    @Provides
    fun providerRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    @Singleton
    @Provides
    fun providesWeatherApi(retrofit: Retrofit): WeatherApi{
        return  retrofit.create(WeatherApi::class.java)
    }
}