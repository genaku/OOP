package com.gen.lab4

import com.gen.lab4.Shapes.*
import org.junit.Test

import org.junit.Assert.*

/**
 * Created by Fenix on 24.04.2016.
 */
class ShapeFactoryTest {

    val factory = ShapeFactory()

    val triangle = "{ \"shape\": \"triangle\", \"color\": \"red\", \"data\": [ { \"x\": 1, \"y\": 3 }, { \"x\": 1, \"y\": 3 }, { \"x\": 1, \"y\": 3 } ]}"

    val trData = TriangleData(Point(1,2), Point(3,4), Point(5,6))

    @Test
    fun testCreateShape() {
        val point = Point(0, 0)
        //assert(factory.jsonTriangle.toJson(trData) == "")
        assert(factory.createShape(triangle) is Triangle)
        //assert(factory.createShape(ShapeType.rectangle, ColorEnum.Black, RectangleData(point, point)) is Rectangle)
        //assert(factory.createShape(ShapeType.ellipse, ColorEnum.Black, EllipseData(point, 0, 0)) is Ellipse)
        //assert(factory.createShape(ShapeType.regular_polygon, ColorEnum.Black, PolygonData(1, point, 0)) is RegularPolygon)
    }
}