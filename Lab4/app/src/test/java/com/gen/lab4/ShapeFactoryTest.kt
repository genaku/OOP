package com.gen.lab4

import com.gen.lab4.Const.ColorEnum
import com.gen.lab4.Point
import com.gen.lab4.Shapes.*
import org.junit.Test

import org.junit.Assert.*

/**
 * Created by Fenix on 24.04.2016.
 */
class ShapeFactoryTest {

    val factory = ShapeFactory()

    val triangleStr = "{ \"shape\": \"triangle\", \"color\": \"red\", \"data\": [ { \"x\": 1, \"y\": 3 }, { \"x\": 3, \"y\": 3 }, { \"x\": 1, \"y\": 5} ]}"
    val rectangleStr = "{ \"shape\": \"rectangle\", \"color\": \"blue\", \"data\": [ { \"x\": 1, \"y\": 3 }, { \"x\": 3, \"y\": 3 } ]}"
    val ellipseStr = "{ \"shape\": \"ellipse\", \"color\": \"black\", \"data\": { \"center\": { \"x\": 3, \"y\": 4 }, \"h_radius\": 3, \"v_radius\": 4}}"
    val polygonStr = "{ \"shape\": \"regular_polygon\", \"color\": \"red\", \"data\": { \"center\": { \"x\": 3, \"y\": 4 }, \"vertexes\": 8, \"radius\": 4}}"


    @Test
    fun testCreateShape() {
        val triangleShape = factory.createShape(triangleStr)
        assert(triangleShape is Triangle)
        assertEquals(triangleShape?.color, ColorEnum.red)
        assertEquals((triangleShape as Triangle).data, TriangleData(Point(1.0f, 3.0f), Point(3.0f, 3.0f), Point(1.0f, 5.0f)))

        val rectangleShape = factory.createShape(rectangleStr)
        assert(rectangleShape is Rectangle)
        assertEquals(rectangleShape?.color, ColorEnum.blue)
        assertEquals((rectangleShape as Rectangle).data, RectangleData(Point(1.0f, 3.0f), Point(3.0f, 3.0f)))

        val ellipseShape = factory.createShape(ellipseStr)
        assert(ellipseShape is Ellipse)
        assertEquals(ellipseShape?.color, ColorEnum.black)
        assertEquals((ellipseShape as Ellipse).data, EllipseData(Point(3.0f, 4.0f), 3.0f, 4.0f))

        val polygonShape = factory.createShape(polygonStr)
        assert(polygonShape is RegularPolygon)
        assertEquals(polygonShape?.color, ColorEnum.red)
        assertEquals((polygonShape as RegularPolygon).data, PolygonData(Point(3.0f, 4.0f), 8, 4.0f))
    }

}