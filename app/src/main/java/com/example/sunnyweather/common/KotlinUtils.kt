package com.example.sunnyweather.common

import android.util.Log
import android.widget.Toast
import com.example.sunnyweather.SunnyWeatherApplication

fun String.showToast(duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(SunnyWeatherApplication.context, this, duration).show()
}

fun Int.showToast(duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(SunnyWeatherApplication.context, this, duration).show()

}



