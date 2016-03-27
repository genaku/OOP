package com.gen.lab31.Beverage

import com.gen.lab31.Const.PortionType
import junit.framework.TestCase

/**
 * Created by Fenix on 26.03.2016.
 */
class LatteTest : TestCase() {
    fun testDefaultLatte() {
        val coffee = Latte()
        assertEquals("Latte", coffee.getDescription())
        assertEquals(90.0, coffee.getCost())
    }

    fun testDoubleLatte() {
        val coffee = Latte(PortionType.Double)
        assertEquals("Latte Double", coffee.getDescription())
        assertEquals(130.0, coffee.getCost())
    }

    fun testStandardLatte() {
        val coffee = Latte(PortionType.Standard)
        assertEquals("Latte", coffee.getDescription())
        assertEquals(90.0, coffee.getCost())
    }
}