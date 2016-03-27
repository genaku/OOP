package com.gen.lab31.Condiment

import com.gen.lab31.Const.IceCubeType
import com.gen.lab31.Const.LiquorType
import com.gen.lab31.Interfaces.IBeverage

/**
 * Created by Fenix on 26.03.2016.
 */
class Liquor(beverage: IBeverage, val type: LiquorType) : CondimentDecorator(beverage) {
    override fun getCondimentDescription(): String {
        return "${type.name} liquor"
    }

    override fun getCondimentCost(): Double {
        return (when (type) {
            LiquorType.Hazelnut -> 20.0
            LiquorType.Chocolate -> 15.0
        })
    }
}