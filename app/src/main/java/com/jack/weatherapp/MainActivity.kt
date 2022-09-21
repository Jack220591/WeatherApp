package com.jack.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.google.accompanist.pager.ExperimentalPagerApi
import com.jack.weatherapp.presentation.screens.main.MainScreen
import com.jack.weatherapp.presentation.screens.main.MainViewModel
import com.jack.weatherapp.ui.theme.WeatherAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalPagerApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel by viewModels<MainViewModel>()

        setContent {
            WeatherAppTheme {
                MainScreen(viewModel)
            }
        }
    }
}

