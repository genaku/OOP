package com.gen.lab31.Beverage

import com.gen.lab31.Const.PortionType

/**
 * Created by Fenix on 26.03.2016.
 */
class Latte(portionType: PortionType = PortionType.Standard) : Coffee(portionType, "Latte") {
    override fun getCost(): Double {
        return when (portionType) {
            PortionType.Standard -> 90.0
            PortionType.Double -> 130.0
        }
    }
}