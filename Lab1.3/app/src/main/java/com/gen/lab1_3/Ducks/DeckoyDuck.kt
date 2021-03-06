package com.gen.lab1_3.Ducks

import android.util.Log
import com.gen.lab1_3.Consts
import com.gen.lab1_3.Strategies.Dance
import com.gen.lab1_3.Strategies.Fly
import com.gen.lab1_3.Strategies.Voice

/**
 * Created by Fenix on 12.03.2016.
 */
class DeckoyDuck() : Duck({ Fly.flyNoWay() }, { Voice.muteQuack() }, { Dance.noDance() }) {
    override fun display() {
        Log.i(Consts.LogTag, "I'm deckoy duck")
    }
}