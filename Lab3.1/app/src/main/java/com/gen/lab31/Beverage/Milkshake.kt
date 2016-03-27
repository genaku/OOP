package com.gen.lab31.Beverage

import com.gen.lab31.Const.MilkshakePortionType

/**
 * Created by Fenix on 26.03.2016.
 */
class Milkshake(val portionType: MilkshakePortionType) : Beverage("Milkshake"){
    override fun getDescription(): String {
        return "$mDescription ${portionType.name}"
    }
    override fun getCost(): Double {
        return when (portionType) {
            MilkshakePortionType.Small -> 50.0
            MilkshakePortionType.Middle -> 60.0
            MilkshakePortionType.Big -> 80.0
        }
    }
}