package com.gen.lab2.Display

import android.util.Log
import com.gen.lab2.Data.StatData
import com.gen.lab2.Data.WeatherInfo
import com.gen.lab2.IObserver

/**
 * Created by Fenix on 20.03.2016.
 */
open class StatsDisplay(override var priority: Int) : IObserver<WeatherInfo> {

    private val mStatTemperature = StatData()
    private val mStatPressure = StatData()
    private val mStatHumidity = StatData()

    override fun update(data: WeatherInfo) {
        processData(data)
        showData()
    }

    protected open fun showData() {
        showStatData("temperature", mStatTemperature)
        showStatData("preassure", mStatPressure)
        showStatData("humidity", mStatHumidity)
    }

    protected fun showStatData(description: String, data: StatData) {
        Log.i("weather", "Min $description ${data.minValue}")
        Log.i("weather", "Max $description ${data.maxValue}")
        Log.i("weather", "Avg $description ${data.avgValue}")
    }

    protected open fun processData(data: WeatherInfo) {
        mStatTemperature.add(data.temperature)
        mStatPressure.add(data.pressure)
        mStatHumidity.add(data.humidity)
    }

}