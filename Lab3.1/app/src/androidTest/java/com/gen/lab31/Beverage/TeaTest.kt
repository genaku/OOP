package com.gen.lab31.Beverage

import com.gen.lab31.Const.MilkshakePortionType
import com.gen.lab31.Const.TeaType
import junit.framework.TestCase

/**
 * Created by Fenix on 26.03.2016.
 */
class TeaTest : TestCase(){
    fun testBlackTea() {
        val tea = Tea(TeaType.Black)
        assertEquals("Black Tea", tea.getDescription())
        assertEquals(30.0, tea.getCost())
    }

    fun testGreenTea() {
        val tea = Tea(TeaType.Green)
        assertEquals("Green Tea", tea.getDescription())
        assertEquals(30.0, tea.getCost())
    }

    fun testCarcadeTea() {
        val tea = Tea(TeaType.Carcade)
        assertEquals("Carcade Tea", tea.getDescription())
        assertEquals(30.0, tea.getCost())
    }

    fun testWhiteTea() {
        val tea = Tea(TeaType.White)
        assertEquals("White Tea", tea.getDescription())
        assertEquals(30.0, tea.getCost())
    }
}