package com.gen.lab1.Strategies.Dance

import android.util.Log
import com.gen.lab1.Consts
import com.gen.lab1.Interfaces.IDanceBehavior

/**
 * Created by Fenix on 12.03.2016.
 */
class MinuetBehavior : IDanceBehavior {
    override fun dance() {
        Log.i(Consts.LogTag, "I'm dancing minuet")
    }
}