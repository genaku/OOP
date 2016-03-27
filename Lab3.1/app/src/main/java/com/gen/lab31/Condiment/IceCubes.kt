package com.gen.lab31.Condiment

import com.gen.lab31.Const.IceCubeType
import com.gen.lab31.Interfaces.IBeverage

/**
 * Created by Fenix on 26.03.2016.
 */
class IceCubes(beverage: IBeverage, val quantity: Int, val type: IceCubeType = IceCubeType.Water) : CondimentDecorator(beverage) {
    override fun getCondimentDescription(): String {
        return "${type.name} ice cubes x $quantity"
    }

    override fun getCondimentCost(): Double {
        return quantity *
                (when (type) {
                    IceCubeType.Dry -> 20.0
                    IceCubeType.Water -> 5.0
                })
    }
}