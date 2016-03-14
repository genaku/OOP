package com.gen.lab1_3.Strategies

import android.util.Log
import com.gen.lab1_3.Consts

/**
 * Created by Fenix on 13.03.2016.
 */
object Dance {
    fun minuet() {
        Log.i(Consts.LogTag, "I'm dancing minuet")
    }

    fun waltz() {
        Log.i(Consts.LogTag, "I'm dancing waltz")
    }

    fun noDance() {
    }
}