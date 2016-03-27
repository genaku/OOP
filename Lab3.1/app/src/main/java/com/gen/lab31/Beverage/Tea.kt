package com.gen.lab31.Beverage

import com.gen.lab31.Const.TeaType

/**
 * Created by Fenix on 26.03.2016.
 */
class Tea(val teaType: TeaType) : Beverage("Tea"){
    override fun getDescription(): String {
        return "${teaType.name} $mDescription"
    }
    override fun getCost(): Double {
        return 30.0
    }
}