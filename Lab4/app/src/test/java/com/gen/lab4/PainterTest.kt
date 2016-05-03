package com.gen.lab4

import com.gen.lab4.Const.ColorEnum
import com.gen.lab4.Shapes.*
import org.junit.Test

import org.junit.Assert.*

/**
 * Created by Fenix on 03.05.2016.
 */
class PainterTest {


    @Test
    fun testDrawPicture() {
        val draft = PictureDraft()
        draft.addShape(Ellipse(ColorEnum.red, EllipseData(Point(100.0f, 400.0f), 50f, 80f)))
        draft.addShape(Rectangle(ColorEnum.blue, RectangleData(Point(10f, 5f), Point(200f, 300f))))
        draft.addShape(Triangle(ColorEnum.green, TriangleData(Point(300f, 10f), Point(600f, 10f), Point(450f, 400f))))
        draft.addShape(RegularPolygon(ColorEnum.black, PolygonData(Point(300f, 400f), 8, 100f)))

        val canvasOutputExpected = "ellipse center Point(x=100.0, y=400.0) 50.0 x 80.0 color red\n"+
                "line from (10.0,5.0) to (10.0,300.0) color blue\n"+
                "line from (10.0,300.0) to (200.0,300.0) color blue\n"+
                "line from (200.0,300.0) to (200.0,5.0) color blue\n"+
                "line from (200.0,5.0) to (10.0,5.0) color blue\n"+
                "line from (300.0,10.0) to (600.0,10.0) color green\n"+
                "line from (600.0,10.0) to (450.0,400.0) color green\n"+
                "line from (450.0,400.0) to (300.0,10.0) color green\n"+
                "line from (400.0,300.0) to (370.7107,370.7107) color black\n"+
                "line from (370.7107,370.7107) to (300.0,400.0) color black\n"+
                "line from (300.0,400.0) to (229.28932,370.7107) color black\n"+
                "line from (229.28932,370.7107) to (200.0,300.0) color black\n"+
                "line from (200.0,300.0) to (229.28932,229.28932) color black\n"+
                "line from (229.28932,229.28932) to (300.0,200.0) color black\n"+
                "line from (300.0,200.0) to (370.7107,229.28932) color black\n"+
                "line from (370.7107,229.28932) to (400.0,300.0) color black\n"

        val painter = Painter()
        val canvas = MockCanvas()

        painter.drawPicture(draft, canvas)
        assertEquals(canvas.canvasOutput, canvasOutputExpected)
    }
}