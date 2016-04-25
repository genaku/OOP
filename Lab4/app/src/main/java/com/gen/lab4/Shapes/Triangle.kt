package com.gen.lab4.Shapes

import com.gen.lab4.ColorEnum
import com.gen.lab4.Point
import com.gen.lab4.ICanvas

/**
 * Created by Fenix on 24.04.2016.
 */
class Triangle(color: ColorEnum, val data: TriangleData) : Shape(color) {
    override fun draw(canvas: ICanvas) {
        throw UnsupportedOperationException()
    }
}

data class TriangleData(var vertex1: Point, var vertex2: Point, var vertex3: Point)
/*

{
  "shape": "triangle",
  "color": "red",
  "data": {
    "vertex1": {
      "x": 1,
      "y": 3
    },
    "vertex2": {
      "x": 1,
      "y": 3
    },
    "vertex3": {
      "x": 1,
      "y": 3
    }
  }
}

 */