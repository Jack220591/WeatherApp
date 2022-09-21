package com.jack.weatherapp.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeatherModel(
    val location: LocationModel? = null,
    val current: CurrentModel? = null,
    val forecast: ForecastModel? = null
)

@Serializable
data class LocationModel(
    val name: String,
    val localtime: String
)

@Serializable
data class CurrentModel(
    @SerialName("last_updated")
    val lastUpdated: String,
    val condition: ConditionModel
)

@Serializable
data class ConditionModel(
    val text: String,
    val icon: String
)

@Serializable
data class ForecastModel(
    val forecastday: List<ForecastDayModel>
)

@Serializable
data class ForecastDayModel(
    val date: String,
    val day: DayModel,
    val hour: List<HourModel>
)

@Serializable
data class DayModel(
    @SerialName("maxtemp_c")
    val maxTemp: String,
    @SerialName("mintemp_c")
    val minTemp: String,
    val condition: ConditionModel
)

@Serializable
data class HourModel(
    val time: String,
    @SerialName("temp_c")
    val temp: String,
    val condition: ConditionModel
)