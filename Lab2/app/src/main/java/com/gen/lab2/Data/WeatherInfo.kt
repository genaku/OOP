package com.gen.lab2.Data

import com.gen.lab2.Const.Place

/**
 * Created by Fenix on 20.03.2016.
 */
data class WeatherInfo(
        val place: Place,
        var temperature: Double,
        var humidity: Double,
        var pressure: Double,
        var windDirection: Double?,
        var windStrength: Double?
)