package com.gen.lab4

import com.gen.lab4.Const.ColorEnum
import com.gen.lab4.Point
import com.gen.lab4.Shapes.*
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by Fenix on 24.04.2016.
 */
class ShapesTest {

    val canvas = MockCanvas()

    @Test
    fun testRectangle() {
        canvas.reset()
        Rectangle(ColorEnum.black, RectangleData(Point(1.0f, 2.0f), Point(3.0f, 4.0f))).draw(canvas)
        assertEquals(canvas.canvasOutput, "line from (1.0,2.0) to (1.0,4.0) color black\nline from (1.0,4.0) to (3.0,4.0) color black\nline from (3.0,4.0) to (3.0,2.0) color black\nline from (3.0,2.0) to (1.0,2.0) color black\n")
    }

    @Test
    fun testEllipse() {
        canvas.reset()
        Ellipse(ColorEnum.blue, EllipseData(Point(1.0f, 1.0f), 2.0f, 4.0f)).draw(canvas)
        assertEquals(canvas.canvasOutput, "ellipse center Point(x=1.0, y=1.0) 2.0 x 4.0 color blue\n")
    }

    @Test
    fun testTriangle() {
        canvas.reset()
        Triangle(ColorEnum.red, TriangleData(Point(1.0f, 1.0f), Point(5.0f, 1.0f), Point(3.0f, 4.0f))).draw(canvas)
        assertEquals(canvas.canvasOutput, "line from (1.0,1.0) to (5.0,1.0) color red\nline from (5.0,1.0) to (3.0,4.0) color red\nline from (3.0,4.0) to (1.0,1.0) color red\n")
    }

    @Test
    fun testPolygon() {
        canvas.reset()
        RegularPolygon(ColorEnum.red, PolygonData(Point(1.0f, 1.0f), 5, 4.0f)).draw(canvas)
        assertEquals(canvas.canvasOutput, "line from (5.0,1.0) to (2.236068,4.804226) color red\nline from (2.236068,4.804226) to (-2.236068,3.351141) color red\nline from (-2.236068,3.351141) to (-2.236068,-1.351141) color red\nline from (-2.236068,-1.351141) to (2.236068,-2.8042262) color red\nline from (2.236068,-2.8042262) to (5.0,1.0) color red\n")
    }

}

