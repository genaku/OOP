package com.gen.lab31.Condiment

import com.gen.lab31.Beverage.Beverage
import com.gen.lab31.Beverage.Coffee
import com.gen.lab31.Const.ChocolatePieces
import com.gen.lab31.Const.IceCubeType
import com.gen.lab31.Const.LiquorType
import com.gen.lab31.Const.SyrupType
import com.gen.lab31.Interfaces.IBeverage
import junit.framework.TestCase

/**
 * Created by Fenix on 26.03.2016.
 */
class CondimentTest : TestCase() {

    val coffeePrice = 60.0

    fun assertBeverage(beverage: IBeverage, description: String, price: Double) {
        assertEquals(description, beverage.getDescription())
        assertEquals(price, beverage.getCost())
    }

    fun testCinnamonOnBeverage() {
        assertBeverage(Cinnamon(Beverage("drink")), "drink, Cinnamon", 20.0)
    }

    fun testCinnamonOnCoffee() {
        assertBeverage(Cinnamon(Coffee()), "Coffee, Cinnamon", coffeePrice + 20.0)
    }

    fun testLemonOnBeverage() {
        assertBeverage(Lemon(Beverage("drink"), 1), "drink, Lemon x 1", 10.0)
        assertBeverage(Lemon(Beverage("drink"), 2), "drink, Lemon x 2", 20.0)
    }

    fun testLemonOnCoffee() {
        assertBeverage(Lemon(Coffee(), 2), "Coffee, Lemon x 2", coffeePrice + 20.0)
    }

    fun testCoconutFlakesOnBeverage() {
        assertBeverage(CoconutFlakes(Beverage("drink"), 5), "drink, Coconut flakes 5 g", 5.0)
    }

    fun testCoconutFlakesOnCoffee() {
        assertBeverage(CoconutFlakes(Coffee(), 2), "Coffee, Coconut flakes 2 g", coffeePrice + 2.0)
    }

    fun testChocolateCrumbsOnCoffee() {
        assertBeverage(ChocolateCrumbs(Coffee(), 2), "Coffee, Chocolate crumbs 2 g", coffeePrice + 4.0)
    }

    fun testSyrupOnCoffee() {
        assertBeverage(Syrup(Coffee(), SyrupType.Chocolate), "Coffee, Chocolate syrup", coffeePrice + 15.0)
        assertBeverage(Syrup(Coffee(), SyrupType.Maple), "Coffee, Maple syrup", coffeePrice + 15.0)
    }

    fun testIceCubesOnCoffee() {
        assertBeverage(IceCubes(Coffee(), 2), "Coffee, Water ice cubes x 2", coffeePrice + 2*5.0)
        assertBeverage(IceCubes(Coffee(), 2, IceCubeType.Water), "Coffee, Water ice cubes x 2", coffeePrice + 2*5.0)
        assertBeverage(IceCubes(Coffee(), 2, IceCubeType.Dry), "Coffee, Dry ice cubes x 2", coffeePrice + 2*20.0)
    }

    fun testCreamOnCoffee() {
        assertBeverage(Cream(Coffee()), "Coffee, Cream", coffeePrice + 25.0)
    }

    fun testLiquorOnCoffee() {
        assertBeverage(Liquor(Coffee(), LiquorType.Chocolate), "Coffee, Chocolate liquor", coffeePrice + 15.0)
        assertBeverage(Liquor(Coffee(), LiquorType.Hazelnut), "Coffee, Hazelnut liquor", coffeePrice + 20.0)
    }

    fun testChocolateOnCoffee() {
        assertBeverage(Chocolate(Coffee(), ChocolatePieces.One), "Coffee, Chocolate 1 piece(s)", coffeePrice + 10.0)
        assertBeverage(Chocolate(Coffee(), ChocolatePieces.Five), "Coffee, Chocolate 5 piece(s)", coffeePrice + 5*10.0)
    }

}