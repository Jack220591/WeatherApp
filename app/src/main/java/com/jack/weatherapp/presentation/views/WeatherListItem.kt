package com.jack.weatherapp.presentation.views

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.jack.weatherapp.ui.theme.BlueLight

@Preview(showBackground = true)
@Composable
fun WeatherListItem() {
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
                Text(text = "12:00")
                Text(text = "Sunny", color = Color.White)
            }
            Text(
                text = "25°С",
                color = Color.White,
                style = TextStyle(
                    fontSize = 25.sp
                )
            )
            Image(
                painter = rememberImagePainter(data ="https://cdn.weatherapi.com/weather/64x64/day/296.png"),
                contentDescription = "Image1",
                contentScale = ContentScale.Crop,
                modifier = Modifier.padding(end = 8.dp).size(35.dp)
            )
        }
    }
}