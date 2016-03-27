package com.gen.lab31.Condiment

import com.gen.lab31.Interfaces.IBeverage

/**
 * Created by Fenix on 26.03.2016.
 */
abstract class CondimentDecorator(val beverage: IBeverage) : IBeverage {

    abstract protected fun getCondimentDescription(): String
    abstract protected fun getCondimentCost(): Double

    override fun getDescription(): String {
        return beverage.getDescription() + ", " + getCondimentDescription();
    }

    override fun getCost(): Double {
        return beverage.getCost() + getCondimentCost();
    }
}