package com.gen.lab4

import com.gen.lab4.Const.ColorEnum
import com.gen.lab4.Point

/**
 * Created by Fenix on 25.04.2016.
 */
class MockCanvas : ICanvas {

    private lateinit var mColor: ColorEnum
    lateinit var canvasOutput: String

    init {
        reset()
    }

    fun reset() {
        mColor = ColorEnum.black
        canvasOutput = ""
    }

    override fun setColor(color: ColorEnum) {
        mColor = color
    }

    override fun drawLine(from: Point, to: Point) {
        canvasOutput += "line from (${from.x},${from.y}) to (${to.x},${to.y}) color ${mColor.name}\n"
    }

    override fun drawEllipse(center: Point, hRadius: Float, vRadius: Float) {
        canvasOutput += "ellipse center ${center.toString()} $hRadius x $vRadius color ${mColor.name}\n"
    }
}