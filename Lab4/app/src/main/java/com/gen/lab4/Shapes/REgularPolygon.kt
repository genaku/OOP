package com.gen.lab4.Shapes

import com.gen.lab4.Const.ColorEnum
import com.gen.lab4.Point
import com.gen.lab4.ICanvas
import java.util.*

/**
 * Created by Fenix on 24.04.2016.
 */
class RegularPolygon(color: ColorEnum, val data: PolygonData) : Shape(color) {

    private var mCalcKoef: Double = 1.0

    override fun draw(canvas: ICanvas) {
        val coords = calcCoords()
        canvas.setColor(color)
        for (i in 0..data.vertexCount-2) {
           canvas.drawLine(coords[i], coords[i+1])
        }
        canvas.drawLine(coords[data.vertexCount-1], coords[0])
    }

    override fun toString(): String {
        return "RegularPolygon: color: ${color.name} data: ${data.toString()}"
    }

    private fun calcCoords(): ArrayList<Point> {
        mCalcKoef = 2*Math.PI/data.vertexCount
        val result = ArrayList<Point>()
        for (i in 0..data.vertexCount-1) {
            result.add(Point(calcX(i), calcY(i)))
        }
       return result
    }

    private fun calcX(i: Int): Float {
        return (data.center.x + data.radius*Math.cos(i*mCalcKoef)).toFloat()
    }

    private fun calcY(i: Int): Float {
        return (data.center.x + data.radius*Math.sin(i*mCalcKoef)).toFloat()
    }
}


data class PolygonData(var center: Point, var vertexCount: Int, var radius: Float)