package com.jack.weatherapp.presentation.screens.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.jack.weatherapp.R
import com.jack.weatherapp.presentation.views.TableLayout

@Composable
fun MainScreen() {
    Image(
        painter = painterResource(id = R.drawable.blue_sky_image),
        contentDescription = "background",
        modifier = Modifier
            .fillMaxSize()
            .alpha(0.6f),
        contentScale = ContentScale.FillBounds
    )
    Column {
        MainCard()
        TableLayout()
    }
}