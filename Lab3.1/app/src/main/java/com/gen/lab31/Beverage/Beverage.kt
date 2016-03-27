package com.gen.lab31.Beverage

import android.accounts.AuthenticatorDescription
import com.gen.lab31.Interfaces.IBeverage

/**
 * Created by Fenix on 26.03.2016.
 */
open class Beverage(description: String) : IBeverage {
    val mDescription = description

    override fun getDescription(): String {
        return mDescription;
    }

    override fun getCost(): Double {
        return 0.0
    }
}