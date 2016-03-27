package com.gen.lab2.Display

import android.util.Log
import com.gen.lab2.Data.WeatherInfo

/**
 * Created by Fenix on 27.03.2016.
 */
class WeatherDisplayPro(priority: Int) : WeatherDisplay(priority) {

    override fun update(data: WeatherInfo) {
        super.update(data)
        if ((data.windStrength != null) && (data.windDirection != null)) {
            Log.i("weather", "Current wind direction ${data.windDirection} ${data.place.stationName}")
            Log.i("weather", "Current wind strength ${data.windStrength} ${data.place.stationName}")
        }
    }

}