package com.example.weatherapp_jpc.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.ListItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterEnd
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.End
import androidx.compose.ui.Alignment.Companion.TopEnd
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.lerp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.weatherapp_jpc.data.remote.models.Weather
import com.example.weatherapp_jpc.data.remote.models.weatherModel
import com.example.weatherapp_jpc.domain.items.WeatherItems
import com.example.weatherapp_jpc.ui.viewModel.WeatherViewModel
import kotlin.math.max
import kotlin.math.min
import com.example.weatherapp_jpc.R




@Composable
fun DetailScreen(id: String, weatherViewModel: WeatherViewModel, navController: NavController) {
    weatherViewModel.getWeatherById(id.toInt())
    val weather = weatherViewModel.weather.observeAsState().value

    LazyColumn {
        item() {
            Column() {

                        Icon(
                            painter = painterResource(id = R.drawable.sun2),
                            contentDescription = null,
                            modifier = Modifier.fillMaxWidth())


                Text(
                    fontFamily = FontFamily(Font(R.font.josefinsansbold)),
                    fontSize = 55.sp,
                    text = weather?.main?.temp.toString() ?: "",
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(10.dp)
                )
                Text(
                    fontFamily = FontFamily(Font(R.font.josefinsanslight)),
                    fontSize = 30.sp,
                    text = weather?.name ?: "",
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(10.dp)
                )
                Text(
                    fontFamily = FontFamily(Font(R.font.josefinsanslight)),
                    fontSize = 30.sp,
                    text = weather?.weather?.firstOrNull()?.description ?: "",
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(10.dp)
                )

                Text(
                    fontFamily = FontFamily(Font(R.font.josefinsanslight)),
                    fontSize = 30.sp,
                    text = weather?.weather?.firstOrNull()?.main ?: "",
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(10.dp)
                )
                /******************************************/
                /******************************************/
                /*main  */
                /******************************************/
                /******************************************/
                Card(
                    elevation = 10.dp,
                    shape = RoundedCornerShape(7.dp),
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth()
                ) {

                    Row() {
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .align(alignment = Alignment.CenterVertically)
                        ) {

                            Icon(
                                painter = painterResource(id = R.drawable.pressure),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxSize()
                            )
                            Text(
                                fontFamily = FontFamily(Font(R.font.josefinsansbolditalic)),
                                text =
                                weather?.main?.pressure.toString() ?: "" ,
                                modifier = Modifier
                                    .align(Center)
                                    .padding(25.dp)
                            )
                        }
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .align(alignment = Alignment.CenterVertically)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.min_temperature),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxSize()
                            )
                            Text(
                                fontFamily = FontFamily(Font(R.font.josefinsansbolditalic)),
                                text = weather?.main?.temp_min.toString() ?: "",
                                modifier = Modifier
                                    .align(Center)
                                    .padding(25.dp)
                            )
                        }

                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .align(alignment = Alignment.CenterVertically)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.max_temperature),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxSize()
                            )
                            Text(
                                fontFamily = FontFamily(Font(R.font.josefinsansbolditalic)),
                                text = weather?.main?.temp_max.toString() ?: "",
                                modifier = Modifier
                                    .align(Center)
                                    .padding(25.dp)
                            )
                        }
                    }
                }
                /******************************************/
                /******************************************/
                /*main main wind */
                /******************************************/
                /******************************************/

                Card(
                    elevation = 10.dp,
                    shape = RoundedCornerShape(7.dp),
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth()
                ) {
                    Row() {

                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .align(alignment = Alignment.CenterVertically)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.feels_like),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxSize()
                            )
                            Text(
                                fontFamily = FontFamily(Font(R.font.josefinsansbolditalic)),
                                fontSize = 25.sp,
                                text = weather?.main?.feels_like.toString() ?: "",
                                modifier = Modifier
                                    .align(Center)
                                    .padding(25.dp)
                            )
                        }

                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .align(alignment = Alignment.CenterVertically)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.humidity),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxSize()
                            )
                            Text(
                                fontFamily = FontFamily(Font(R.font.josefinsansbolditalic)),
                                fontSize = 25.sp,
                                text = weather?.main?.humidity.toString() ?: "",
                                modifier = Modifier
                                    .align(Center)
                                    .padding(25.dp)
                            )
                        }
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .align(alignment = Alignment.CenterVertically)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.speed),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxSize()
                            )
                            Text(
                                fontFamily = FontFamily(Font(R.font.josefinsansbolditalic)),
                                fontSize = 25.sp,
                                text = weather?.wind?.speed.toString() ?: "",
                                modifier = Modifier
                                    .align(Center)
                                    .padding(25.dp)
                            )
                        }
                    }
                }

                /******************************************/
                /******************************************/
                /*sys */
                /******************************************/
                /******************************************/

                Card(
                    elevation = 10.dp,
                    shape = RoundedCornerShape(7.dp),
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth()
                ) {
                    Row() {

                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .align(alignment = Alignment.CenterVertically)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.sunrise),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxSize()
                            )
                            Text(
                                fontFamily = FontFamily(Font(R.font.josefinsansbolditalic)),
                                fontSize = 25.sp,
                                text = weather?.sys?.sunrise.toString() ?: "",
                                modifier = Modifier
                                    .align(Center)
                                    .padding(25.dp)
                            )
                        }

                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .align(alignment = Alignment.CenterVertically)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.sunset),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxSize()
                            )
                            Text(
                                fontFamily = FontFamily(Font(R.font.josefinsansbolditalic)),
                                fontSize = 25.sp,
                                text = weather?.sys?.sunset.toString() ?: "",
                                modifier = Modifier
                                    .align(Center)
                                    .padding(25.dp)
                            )
                        }
                    }
                }

            }
        }
    }

}


