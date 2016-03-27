package com.gen.lab31.Condiment

import com.gen.lab31.Interfaces.IBeverage

/**
 * Created by Fenix on 26.03.2016.
 */
class Cream (beverage: IBeverage) : CondimentDecorator(beverage) {
    override fun getCondimentDescription(): String {
        return "Cream"
    }

    override fun getCondimentCost(): Double {
        return 25.0
    }
}