package com.gen.lab2

import android.util.Log

/**
 * Created by Fenix on 20.03.2016.
 */
class WeatherDisplay(override var priority: Int) : IObserver<WeatherInfo> {

    override fun update(data: WeatherInfo) {
        Log.i("weather", "Current Temp ${data.temperature} (${data.place})")
        Log.i("weather", "Current Hum ${data.humidity} (${data.place})")
        Log.i("weather", "Current Pressure ${data.pressure} (${data.place})")
    }

}
