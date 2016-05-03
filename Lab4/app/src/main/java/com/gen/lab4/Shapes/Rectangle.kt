package com.gen.lab4.Shapes

import com.gen.lab4.Const.ColorEnum
import com.gen.lab4.Point
import com.gen.lab4.ICanvas

/**
 * Created by Fenix on 24.04.2016.
 */
class Rectangle(color: ColorEnum, val data: RectangleData) : Shape(color) {
    override fun draw(canvas: ICanvas) {
        val x1 = data.leftTop.x
        val y1 = data.leftTop.y
        val x2 = data.rightBottom.x
        val y2 = data.rightBottom.y
        canvas.setColor(color)
        canvas.drawLine(Point(x1, y1), Point(x1, y2))
        canvas.drawLine(Point(x1, y2), Point(x2, y2))
        canvas.drawLine(Point(x2, y2), Point(x2, y1))
        canvas.drawLine(Point(x2, y1), Point(x1, y1))
    }
    override fun toString(): String {
        return "Rectangle: color: ${color.name} data: ${data.toString()}"
    }
}

data class RectangleData(var leftTop: Point, var rightBottom: Point)