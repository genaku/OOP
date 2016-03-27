package com.gen.lab2.Data

import com.gen.lab2.Const.Place
import com.gen.lab2.Observable

/**
 * Created by Fenix on 20.03.2016.
 */
open class WeatherData(val place: Place = Place.NONE) : Observable<WeatherInfo>() {

    protected val weatherInfo: WeatherInfo = WeatherInfo(place, 0.0, 0.0, 760.0, null, null)

    override fun getChangedData(): WeatherInfo {
        return weatherInfo
    }

    fun setMeasurements(temp: Double, humidity: Double, pressure: Double)
    {
        weatherInfo.temperature = temp
        weatherInfo.humidity = humidity
        weatherInfo.pressure = pressure
        notifyObservers()
    }

}