package com.gen.lab4

import com.gen.lab4.Shapes.Shape

/**
 * Created by Fenix on 24.04.2016.
 */
interface IShapeFactory {
    fun createShape(description: String): Shape?
}