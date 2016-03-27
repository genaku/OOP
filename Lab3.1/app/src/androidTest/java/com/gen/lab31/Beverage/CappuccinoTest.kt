package com.gen.lab31.Beverage

import com.gen.lab31.Const.PortionType
import junit.framework.TestCase

/**
 * Created by Fenix on 26.03.2016.
 */
class CappuccinoTest : TestCase() {
    fun testDefaultLatte() {
        val coffee = Cappuccino()
        assertEquals("Cappuccino", coffee.getDescription())
        assertEquals(80.0, coffee.getCost())
    }

    fun testDoubleLatte() {
        val coffee = Cappuccino(PortionType.Double)
        assertEquals("Cappuccino Double", coffee.getDescription())
        assertEquals(120.0, coffee.getCost())
    }

    fun testStandardLatte() {
        val coffee = Cappuccino(PortionType.Standard)
        assertEquals("Cappuccino", coffee.getDescription())
        assertEquals(80.0, coffee.getCost())
    }
}