package com.jack.weatherapp.presentation.screens.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jack.weatherapp.data.models.WeatherModel
import com.jack.weatherapp.network.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val weatherRepository: WeatherRepository
): ViewModel() {

    private val _weatherData: MutableLiveData<WeatherModel> = MutableLiveData()
    val weatherData: LiveData<WeatherModel> = _weatherData

    fun getWeatherByDays() {
        viewModelScope.launch {
            val result = withContext(Dispatchers.IO) {
                weatherRepository.getWeatherByDays("Moscow", "3")
            }
            _weatherData.value = result
        }
    }
}