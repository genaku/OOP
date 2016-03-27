package com.gen.lab31.Condiment

import com.gen.lab31.Interfaces.IBeverage

/**
 * Created by Fenix on 26.03.2016.
 */
class Cinnamon(beverage: IBeverage) : CondimentDecorator(beverage) {
    override fun getCondimentDescription(): String {
        return "Cinnamon"
    }

    override fun getCondimentCost(): Double {
        return 20.0
    }
}