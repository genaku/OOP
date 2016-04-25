package com.gen.lab4

interface ICanvas {
    fun setColor(color: ColorEnum)
    fun drawLine(from: Point, to: Point)
    fun drawEllipse()
}