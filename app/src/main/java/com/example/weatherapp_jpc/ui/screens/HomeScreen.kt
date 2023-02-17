package com.example.weatherapp_jpc.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.weatherapp_jpc.data.remote.models.weatherModel
import com.example.weatherapp_jpc.domain.items.WeatherItems
import com.example.weatherapp_jpc.ui.nav.Screen
import com.example.weatherapp_jpc.ui.viewModel.WeatherViewModel

@Composable
fun HomeScreen(navController: NavController) {
   
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Weather", fontWeight = FontWeight.Bold)
                }
            )
        }
    ) {
        Button(onClick = { navController.navigate(Screen.Detail.route ) }) {
            Text(text = "dasdas")
        }
    }
}

//@Composable
//fun weatherCard(id: String, weatherViewModel: WeatherViewModel,) {
//
//        Row {
//            Column(modifier = Modifier
//                .padding(10.dp)) {
//                Text(text = weather.name,
//                    fontWeight = FontWeight.Bold,
//                    color = Color.Black)
//                Text(text = weather.base,
//                    fontWeight = FontWeight.Bold)
////                Text(text = weather.dt,
////                    fontWeight = FontWeight.Bold)
////                Text(text = weather.main,
////                    fontWeight = FontWeight.Bold)
////                Text(text = weather.clouds,
////                    fontWeight = FontWeight.Bold)
////                Text(text = weather.cod,
////                    fontWeight = FontWeight.Bold)
////                Text(text = weather.coord,
////                    fontWeight = FontWeight.Bold)
////                Text(text = weather.sys,
////                    fontWeight = FontWeight.Bold)
////                Text(text = weather.timezone,
////                    fontWeight = FontWeight.Bold)
////                Text(text = weather.visibility,
////                    fontWeight = FontWeight.Bold)
////                Text(text = weather.wind,
////                    fontWeight = FontWeight.Bold)
//            }
//        }
//
//    }