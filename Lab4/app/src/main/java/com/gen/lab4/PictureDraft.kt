package com.gen.lab4

import com.gen.lab4.Shapes.Shape
import java.util.*

class PictureDraft {

    val shapeList = ArrayList<Shape>()

    fun addShape(shape: Shape) {
        shapeList.add(shape)
    }

    fun getShapeCount(): Int {
        return shapeList.size
    }

    fun getShape(idx: Int): Shape {
        return shapeList[idx]
    }
}