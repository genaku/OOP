package com.gen.lab1.Ducks

import android.util.Log
import com.gen.lab1.Consts
import com.gen.lab1.Strategies.Fly.FlyWithWings
import com.gen.lab1.Strategies.Dance.MinuetBehavior
import com.gen.lab1.Strategies.Voice.QuackBehavior

/**
 * Created by Fenix on 12.03.2016.
 */
class RedheadDuck() : Duck(FlyWithWings(), QuackBehavior(), MinuetBehavior()) {
    override fun display() {
        Log.i(Consts.LogTag, "I'm redhead duck")
    }
}