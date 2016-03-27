package com.gen.lab2.Display

import android.util.Log
import com.gen.lab2.Data.StatData
import com.gen.lab2.Data.WeatherInfo
import com.gen.lab2.Data.WindDirectionStatData

/**
 * Created by Fenix on 27.03.2016.
 */
class StatsDisplayPro(priority: Int) : StatsDisplay(priority) {

    private val mStatWindStrength = StatData()
    private val mStatWindDirection = WindDirectionStatData()
    private var haveWindData: Boolean = false

    override fun showData() {
        super.showData()
        if (haveWindData) {
            showStatData("wind strength", mStatWindStrength)
            Log.i("weather", "Average wind direction ${mStatWindDirection.avgDirection}")
        }
    }

    override fun processData(data: WeatherInfo) {
        super.processData(data)
        if ((data.windStrength != null) && (data.windDirection != null)) {
            haveWindData = true
            mStatWindStrength.add(data.windStrength ?: 0.0)
            mStatWindDirection.add(data.windDirection ?: 0.0, data.windStrength ?: 0.0)
        }
    }

}