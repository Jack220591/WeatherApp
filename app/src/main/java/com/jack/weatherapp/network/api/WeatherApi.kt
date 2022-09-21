package com.jack.weatherapp.network.api

import com.jack.weatherapp.common.Constants.API_KEY
import com.jack.weatherapp.data.models.WeatherModel
import kotlinx.coroutines.flow.Flow
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("/v1/forecast.json")
    suspend fun getWeatherData(
        @Query("key") apiKey: String = API_KEY,
        @Query("q") q: String,
        @Query("days") days: String,
        @Query("aqi") aqi: String = "no",
        @Query("alerts") alerts: String = "no"
    ): WeatherModel
}