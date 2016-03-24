package com.gen.lab2

/**
 * Created by Fenix on 20.03.2016.
 */
class StatData {

    private var mMinValue: Double = Double.POSITIVE_INFINITY
    private var mMaxValue: Double = Double.NEGATIVE_INFINITY
    private var mAccValue: Double = 0.0
    private var mCountAcc: Int = 0

    val minValue: Double
        get() = mMinValue

    val maxValue: Double
        get() = mMaxValue

    val avgValue: Double
        get() = mAccValue / mCountAcc

    fun add(value: Double) {
        mMinValue = Math.min(mMinValue, value)
        mMaxValue = Math.max(mMaxValue, value)
        mAccValue += value
        ++mCountAcc
    }
}