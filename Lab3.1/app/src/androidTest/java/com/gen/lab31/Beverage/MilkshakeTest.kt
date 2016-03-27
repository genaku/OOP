package com.gen.lab31.Beverage

import com.gen.lab31.Const.MilkshakePortionType
import junit.framework.TestCase

/**
 * Created by Fenix on 26.03.2016.
 */
class MilkshakeTest : TestCase(){
    fun testMilkshakeSmall() {
        val shake = Milkshake(MilkshakePortionType.Small)
        assertEquals("Milkshake Small", shake.getDescription())
        assertEquals(50.0, shake.getCost())
    }

    fun testMilkshakeMiddle() {
        val shake = Milkshake(MilkshakePortionType.Middle)
        assertEquals("Milkshake Middle", shake.getDescription())
        assertEquals(60.0, shake.getCost())
    }

    fun testMilkshakeBig() {
        val shake = Milkshake(MilkshakePortionType.Big)
        assertEquals("Milkshake Big", shake.getDescription())
        assertEquals(80.0, shake.getCost())
    }
}