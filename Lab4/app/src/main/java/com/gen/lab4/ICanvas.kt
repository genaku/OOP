package com.gen.lab4

import com.gen.lab4.Const.ColorEnum
import com.gen.lab4.Point

interface ICanvas {
    fun setColor(color: ColorEnum)
    fun drawLine(from: Point, to: Point)
    fun drawEllipse(center: Point, hRadius: Float, vRadius: Float)
}