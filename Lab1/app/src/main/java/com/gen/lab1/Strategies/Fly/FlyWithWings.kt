package com.gen.lab1.Strategies.Fly

import android.util.Log
import com.gen.lab1.Consts
import com.gen.lab1.Interfaces.IFlyBehavior

/**
 * Created by Gen on 11.03.2016.
 */
class FlyWithWings : IFlyBehavior {

    private var mFlyNumber = 0;

    override fun fly() {
        mFlyNumber += 1
        Log.i(Consts.LogTag, "I'm flying with wings! It's my fly number: $mFlyNumber")
    }
}