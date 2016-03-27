package com.gen.lab31.Condiment

import com.gen.lab31.Const.ChocolatePieces
import com.gen.lab31.Interfaces.IBeverage

/**
 * Created by Fenix on 26.03.2016.
 */
class Chocolate(beverage: IBeverage, val pieces: ChocolatePieces) : CondimentDecorator(beverage) {
    override fun getCondimentDescription(): String {
        return "Chocolate ${pieces.qty} piece(s)"
    }

    override fun getCondimentCost(): Double {
        return 10.0 * pieces.qty
    }
}