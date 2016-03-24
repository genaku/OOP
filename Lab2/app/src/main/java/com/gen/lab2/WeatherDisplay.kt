package com.gen.lab2

import android.util.Log

/**
 * Created by Fenix on 20.03.2016.
 */
class WeatherDisplay : IObserver<WeatherInfo> {

    override fun update(data: WeatherInfo) {
        Log.i("weather", "Current Temp ${data.temperature}")
        Log.i("weather", "Current Hum ${data.humidity}")
        Log.i("weather", "Current Pressure ${data.pressure}")
    }

}
