package com.example.sunnyweather

import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {

    companion object {
        lateinit var context: Context
        const val TOKEN = "eF7daIa4Y09nd06v"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}