package com.jack.weatherapp.presentation.screens.main

import androidx.lifecycle.ViewModel
import com.jack.weatherapp.network.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val weatherRepository: WeatherRepository
): ViewModel() {

}