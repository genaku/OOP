package com.gen.lab31.Condiment

import com.gen.lab31.Const.SyrupType
import com.gen.lab31.Interfaces.IBeverage

/**
 * Created by Fenix on 26.03.2016.
 */
class ChocolateCrumbs(beverage: IBeverage, val mass: Int) : CondimentDecorator(beverage) {
    override fun getCondimentDescription(): String {
        return "Chocolate crumbs $mass g"
    }

    override fun getCondimentCost(): Double {
        return 2.0 * mass
    }
}