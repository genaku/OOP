package com.gen.lab4.Shapes

import com.gen.lab4.ColorEnum
import com.gen.lab4.Point
import com.gen.lab4.ICanvas

/**
 * Created by Fenix on 24.04.2016.
 */
class RegularPolygon(color: ColorEnum, val data: PolygonData) : Shape(color) {
    override fun draw(canvas: ICanvas) {
        throw UnsupportedOperationException()
    }
}

data class PolygonData(var vertexCount: Int, var center: Point, var radius: Int)