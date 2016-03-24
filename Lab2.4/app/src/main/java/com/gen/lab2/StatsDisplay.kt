package com.gen.lab2

import android.util.Log

/**
 * Created by Fenix on 20.03.2016.
 */
class StatsDisplay(override var priority: Int) : IObserver<WeatherInfo> {

    private val mStatTemperature = StatData()
    private val mStatPressure = StatData()
    private val mStatHumidity = StatData()

    override fun update(data: WeatherInfo) {
        processData(data)
        showData(data)
    }

    private fun showData(data: WeatherInfo) {
        Log.i("weather", "Max Temp ${mStatTemperature.minValue}")
        Log.i("weather", "Min Temp ${mStatTemperature.maxValue}")
        Log.i("weather", "Avg Temp ${mStatTemperature.avgValue}")
    }

    private fun processData(data: WeatherInfo) {
        mStatTemperature.add(data.temperature)
        mStatPressure.add(data.pressure)
        mStatHumidity.add(data.humidity)
    }

}