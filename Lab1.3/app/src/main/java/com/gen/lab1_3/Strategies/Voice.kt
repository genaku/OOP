package com.gen.lab1_3.Strategies

import android.util.Log
import com.gen.lab1_3.Consts

/**
 * Created by Fenix on 13.03.2016.
 */
object Voice {
    fun muteQuack() {
    }

    fun quack() {
        Log.i(Consts.LogTag, "Quack Quack!!!")
    }

    fun squeak() {
        Log.i(Consts.LogTag, "Squeek!!!!")
    }
}