package com.gen.lab31.Beverage

import com.gen.lab31.Const.PortionType
import junit.framework.TestCase

/**
 * Created by Fenix on 26.03.2016.
 */
class CoffeeTest : TestCase() {

    fun testDefaultCoffee() {
        val coffee = Coffee()
        assertEquals("Coffee", coffee.getDescription())
        assertEquals(60.0, coffee.getCost())
    }

    fun testDoubleCoffee() {
        val coffee = Coffee(PortionType.Double)
        assertEquals("Coffee Double", coffee.getDescription())
        assertEquals(60.0, coffee.getCost())
    }

    fun testStandardCoffee() {
        val coffee = Coffee(PortionType.Standard)
        assertEquals("Coffee", coffee.getDescription())
        assertEquals(60.0, coffee.getCost())
    }

}