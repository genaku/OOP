package com.gen.lab1.Strategies.Voice

import android.util.Log
import com.gen.lab1.Consts
import com.gen.lab1.Interfaces.IQuackBehavior

/**
 * Created by Fenix on 12.03.2016.
 */
class SqueakBehavior : IQuackBehavior {
    override fun quack() {
        Log.i(Consts.LogTag, "Squeek!!!")
    }
}