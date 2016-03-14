package com.gen.lab1.Ducks

import android.util.Log
import com.gen.lab1.Consts
import com.gen.lab1.Strategies.Fly.FlyNoWay
import com.gen.lab1.Strategies.Voice.MuteQuackBehavior
import com.gen.lab1.Strategies.Dance.NoDanceBehavior

/**
 * Created by Fenix on 12.03.2016.
 */
class DeckoyDuck() : Duck(FlyNoWay(), MuteQuackBehavior(), NoDanceBehavior()) {
    override fun display() {
        Log.i(Consts.LogTag, "I'm deckoy duck")
    }
}