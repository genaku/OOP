package com.gen.lab31.Beverage

import junit.framework.TestCase

/**
 * Created by Fenix on 26.03.2016.
 */
class BeverageTest : TestCase() {

    fun testBeverage() {
        val beverage = Beverage("test descr")
        assertEquals("test descr", beverage.getDescription())
        assertEquals(0.0, beverage.getCost())
    }

}