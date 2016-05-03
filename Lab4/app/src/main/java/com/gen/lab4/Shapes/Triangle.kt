package com.gen.lab4.Shapes

import com.gen.lab4.Const.ColorEnum
import com.gen.lab4.Point
import com.gen.lab4.ICanvas

/**
 * Created by Fenix on 24.04.2016.
 */
class Triangle(color: ColorEnum, val data: TriangleData) : Shape(color) {
    override fun draw(canvas: ICanvas) {
        canvas.setColor(color)
        canvas.drawLine(data.vertex1, data.vertex2)
        canvas.drawLine(data.vertex2, data.vertex3)
        canvas.drawLine(data.vertex3, data.vertex1)

    }

    override fun toString(): String {
        return "Triangle: color: ${color.name} data: ${data.toString()}"
    }
}

data class TriangleData(var vertex1: Point, var vertex2: Point, var vertex3: Point)