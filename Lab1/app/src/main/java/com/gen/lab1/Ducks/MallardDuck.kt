package com.gen.lab1.Ducks

import android.util.Log
import com.gen.lab1.Consts
import com.gen.lab1.Strategies.Fly.FlyWithWings
import com.gen.lab1.Strategies.Voice.QuackBehavior
import com.gen.lab1.Strategies.Dance.WaltzBehavior

/**
 * Created by Fenix on 12.03.2016.
 */
class MallardDuck() : Duck(FlyWithWings(), QuackBehavior(), WaltzBehavior()) {
    override fun display() {
        Log.i(Consts.LogTag, "I'm mallard duck")
    }
}