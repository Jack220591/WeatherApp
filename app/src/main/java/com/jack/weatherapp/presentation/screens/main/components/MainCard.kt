package com.jack.weatherapp.presentation.screens.main

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import coil.network.HttpException
import com.jack.weatherapp.R
import com.jack.weatherapp.ui.theme.BlueLight

@Preview(showBackground = true)
@Composable
fun MainCard() {
    Column(
        modifier = Modifier
            .padding(5.dp)
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            backgroundColor = BlueLight,
            elevation =0.dp,
            shape = RoundedCornerShape(10.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            modifier = Modifier.padding(top = 8.dp, start = 8.dp),
                            text = "20 Jun 2022 13:00",
                            style = TextStyle(fontSize = 15.sp),
                            color = Color.White
                        )

                        Image(
                            painter = rememberImagePainter(data ="https://cdn.weatherapi.com/weather/64x64/day/296.png"),
                            contentDescription = "Image1",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.size(35.dp)
                        )

                    }
                    Text(
                        text = "Moscow",
                        style = TextStyle(fontSize = 24.sp),
                        color = Color.White
                    )
                    Text(
                        text = "23°С",
                        style = TextStyle(fontSize = 65.sp),
                        color = Color.White
                    )
                    Text(
                        text = "Rainy",
                        style = TextStyle(fontSize = 16.sp),
                        color = Color.White
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        IconButton(
                            onClick = {},
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_baseline_search_24),
                                contentDescription = "Icon1",
                                tint = Color.White
                            )

                        }
                        Text(
                            text = "23°C/12°C",
                            style = TextStyle(fontSize = 16.sp),
                            color = Color.White
                        )
                        IconButton(
                            onClick = {},
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_baseline_sync_24),
                                contentDescription = "Icon2",
                                tint = Color.White
                            )

                        }
                    }
                }
            }
        }
    }
}