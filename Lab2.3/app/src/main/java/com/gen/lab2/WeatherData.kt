package com.gen.lab2

/**
 * Created by Fenix on 20.03.2016.
 */
class WeatherData : Observable<WeatherInfo>() {

    private val weatherInfo: WeatherInfo = WeatherInfo(0.0, 0.0, 760.0)

    override fun getChangedData(): WeatherInfo {
        return weatherInfo
    }

    fun getTemperature(): Double = weatherInfo.temperature

    fun getHumidity():Double = weatherInfo.humidity

    fun getPressure(): Double = weatherInfo.pressure

    fun measurementsChanged() {
        notifyObservers()
    }

    fun setMeasurements(temp: Double, humidity: Double, pressure: Double)
    {
        weatherInfo.temperature = temp
        weatherInfo.humidity = humidity
        weatherInfo.pressure = pressure
        measurementsChanged();
    }

}