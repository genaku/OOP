package com.gen.lab31.Condiment

import com.gen.lab31.Interfaces.IBeverage

/**
 * Created by Fenix on 26.03.2016.
 */
class CoconutFlakes(beverage: IBeverage, val mass: Int) : CondimentDecorator(beverage) {
    override fun getCondimentDescription(): String {
        return "Coconut flakes $mass g"
    }

    override fun getCondimentCost(): Double {
        return 1.0 * mass
    }
}