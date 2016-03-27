package com.gen.lab2.Display

import android.util.Log
import com.gen.lab2.Data.WeatherInfo
import com.gen.lab2.IObserver

/**
 * Created by Fenix on 20.03.2016.
 */
open class WeatherDisplay(override var priority: Int) : IObserver<WeatherInfo> {

    override fun update(data: WeatherInfo) {
        Log.i("weather", "Current temperature ${data.temperature} ${data.place.stationName}")
        Log.i("weather", "Current humidity ${data.humidity} ${data.place.stationName}")
        Log.i("weather", "Current pressure ${data.pressure} ${data.place.stationName}")
    }

}
