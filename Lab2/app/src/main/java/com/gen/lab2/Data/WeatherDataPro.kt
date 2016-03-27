package com.gen.lab2.Data

import com.gen.lab2.Const.Place

/**
 * Created by Fenix on 27.03.2016.
 */
class WeatherDataPro(place: Place = Place.NONE) : WeatherData(place) {

    fun setMeasurements(temp: Double, humidity: Double, pressure: Double, windDirection: Double, windStrength: Double)
    {
        weatherInfo.temperature = temp
        weatherInfo.humidity = humidity
        weatherInfo.pressure = pressure
        weatherInfo.windDirection = windDirection
        weatherInfo.windStrength = windStrength
        notifyObservers()
    }

}