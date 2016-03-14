package com.gen.lab1.Ducks

import android.util.Log
import com.gen.lab1.Consts
import com.gen.lab1.Interfaces.IDanceBehavior
import com.gen.lab1.Interfaces.IFlyBehavior
import com.gen.lab1.Interfaces.IQuackBehavior

/**
 * Created by Fenix on 12.03.2016.
 */
abstract class Duck(var flyBehavior: IFlyBehavior, val quackBehavior: IQuackBehavior, val danceBehavior: IDanceBehavior) {

    fun quack() {
        quackBehavior.quack()
    }

    fun fly() {
        flyBehavior.fly()
    }

    fun swim() {
        Log.i(Consts.LogTag, "I'm swimming")
    }

	fun dance() {
		danceBehavior.dance()
	}

	abstract fun display()
}
