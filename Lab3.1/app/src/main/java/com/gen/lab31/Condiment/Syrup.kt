package com.gen.lab31.Condiment

import com.gen.lab31.Const.IceCubeType
import com.gen.lab31.Const.SyrupType
import com.gen.lab31.Interfaces.IBeverage

/**
 * Created by Fenix on 26.03.2016.
 */
class Syrup (beverage: IBeverage, val type: SyrupType) : CondimentDecorator(beverage) {
    override fun getCondimentDescription(): String {
        return "${type.name} syrup"
    }

    override fun getCondimentCost(): Double {
        return 15.0
    }
}