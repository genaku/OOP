package com.gen.lab2.Data

/**
 * Created by Fenix on 27.03.2016.
 */
class WindDirectionStatData {

    private var mSumX: Double = 0.0
    private var mSumY: Double = 0.0

    val avgDirection: Double
        get() = Math.toDegrees(Math.atan(mSumY / mSumX))

    fun add(windDirection: Double, windStrength: Double) {
        mSumX += windStrength * Math.sin(Math.toRadians(windDirection))
        mSumY += windStrength * Math.cos(Math.toRadians(windDirection))
    }
}