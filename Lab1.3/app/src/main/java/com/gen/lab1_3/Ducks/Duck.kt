package com.gen.lab1_3.Ducks

import android.util.Log
import com.gen.lab1_3.Consts

/**
 * Created by Fenix on 12.03.2016.
 */
abstract class Duck(var flyBehavior: () -> Unit, val quackBehavior: () -> Unit, val danceBehavior: () -> Unit) {

    fun quack() {
        quackBehavior()
    }

    fun fly() {
        flyBehavior()
    }

    fun swim() {
        Log.i(Consts.LogTag, "I'm swimming")
    }

	fun dance() {
		danceBehavior()
	}

	abstract fun display()
}
