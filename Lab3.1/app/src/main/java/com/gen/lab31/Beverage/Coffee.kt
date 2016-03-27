package com.gen.lab31.Beverage

import com.gen.lab31.Const.PortionType

/**
 * Created by Fenix on 26.03.2016.
 */
open class Coffee(val portionType: PortionType = PortionType.Standard, description: String = "Coffee") : Beverage(description) {
    override fun getDescription(): String {
        return "$mDescription" + if (portionType != PortionType.Standard) " ${portionType.name}" else ""
    }

    override fun getCost(): Double {
        return 60.0
    }
}