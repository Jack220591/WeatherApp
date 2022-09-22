package com.jack.weatherapp.presentation.screens.main.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.jack.weatherapp.data.models.ForecastDayModel
import com.jack.weatherapp.ui.theme.BlueLight

@Composable
fun WeatherByDaysListItem(
    item: ForecastDayModel
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 3.dp),
        backgroundColor = BlueLight,
        elevation = 0.dp,
        shape = RoundedCornerShape(10.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.padding(start = 8.dp, top = 5.dp, bottom = 5.dp)
            ) {
                Text(text = item.date)
                Text(text = item.day.condition.text, color = Color.White)
            }
            Text(
                text = "${item.day.maxTemp}/${item.day.minTemp}" ,
                color = Color.White,
                style = TextStyle(
                    fontSize = 25.sp
                )
            )
            Image(
                painter = rememberImagePainter(data ="https:${item.day.condition.icon}"),
                contentDescription = "Image1",
                contentScale = ContentScale.Crop,
                modifier = Modifier.padding(end = 8.dp).size(35.dp)
            )
        }
    }
}