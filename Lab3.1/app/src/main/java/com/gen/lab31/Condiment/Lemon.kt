package com.gen.lab31.Condiment

import com.gen.lab31.Interfaces.IBeverage

/**
 * Created by Fenix on 26.03.2016.
 */
class Lemon(beverage: IBeverage, val quantity: Int) : CondimentDecorator(beverage) {
    override fun getCondimentDescription(): String {
        return "Lemon x $quantity"
    }

    override fun getCondimentCost(): Double {
        return 10.0 * quantity
    }
}