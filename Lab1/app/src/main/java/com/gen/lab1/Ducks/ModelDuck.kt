package com.gen.lab1.Ducks

import android.util.Log
import com.gen.lab1.Consts
import com.gen.lab1.Ducks.Duck
import com.gen.lab1.Interfaces.IFlyBehavior
import com.gen.lab1.Interfaces.IQuackBehavior
import com.gen.lab1.Strategies.Fly.FlyNoWay
import com.gen.lab1.Strategies.Dance.NoDanceBehavior
import com.gen.lab1.Strategies.Voice.QuackBehavior

/**
 * Created by Fenix on 12.03.2016.
 */
class ModelDuck() : Duck(FlyNoWay(), QuackBehavior(), NoDanceBehavior()) {
    override fun display() {
        Log.i(Consts.LogTag, "I'm model duck")
    }
}