package com.gen.lab4.Shapes

import com.gen.lab4.ColorEnum
import com.gen.lab4.Point
import com.gen.lab4.ICanvas

/**
 * Created by Fenix on 24.04.2016.
 */
class Ellipse(color: ColorEnum, val data: EllipseData): Shape(color) {
    override fun draw(canvas: ICanvas) {
        throw UnsupportedOperationException()
    }
}

data class EllipseData(var center: Point, var hRadius: Int, var vRadius: Int)