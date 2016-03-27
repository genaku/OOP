package com.gen.lab31.Beverage

import com.gen.lab31.Const.PortionType

/**
 * Created by Fenix on 26.03.2016.
 */
class Cappuccino(portionType: PortionType = PortionType.Standard): Coffee(portionType, "Cappuccino") {
    override fun getCost(): Double {
        return when (portionType) {
            PortionType.Standard -> 80.0
            PortionType.Double -> 120.0
        }
    }
}