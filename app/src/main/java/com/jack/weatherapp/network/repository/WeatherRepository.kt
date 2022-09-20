package com.jack.weatherapp.network.repository

import com.jack.weatherapp.network.api.WeatherApi
import javax.inject.Inject

class WeatherRepository @Inject constructor(
    private val weatherApi: WeatherApi
) {
}