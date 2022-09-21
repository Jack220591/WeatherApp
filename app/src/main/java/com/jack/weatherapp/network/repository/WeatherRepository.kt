package com.jack.weatherapp.network.repository

import com.jack.weatherapp.network.api.WeatherApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class WeatherRepository @Inject constructor(
    private val weatherApi: WeatherApi
) {
    suspend fun getWeatherByDays(
        q: String,
        days: String
    ) = withContext(Dispatchers.IO) { weatherApi.getWeatherData(q = q, days = days) }
}