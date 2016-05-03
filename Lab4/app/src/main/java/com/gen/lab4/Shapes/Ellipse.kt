package com.gen.lab4.Shapes

import android.util.Log
import com.gen.lab4.Const.ColorEnum
import com.gen.lab4.Point
import com.gen.lab4.ICanvas

/**
 * Created by Fenix on 24.04.2016.
 */
class Ellipse(color: ColorEnum, val data: EllipseData): Shape(color) {
    override fun draw(canvas: ICanvas) {
        canvas.setColor(color)
        canvas.drawEllipse(data.center, data.hRadius,data.vRadius)
    }
    override fun toString(): String {
        return "Ellipse: color: ${color.name} data: ${data.toString()}"
    }
}

data class EllipseData(var center: Point, var hRadius: Float, var vRadius: Float)