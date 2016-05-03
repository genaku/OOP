package com.gen.lab4

import android.util.Log
import com.gen.lab4.Const.ColorEnum
import com.gen.lab4.Shapes.*
import org.junit.Test

import org.junit.Assert.*
import java.io.ByteArrayInputStream
import java.nio.charset.StandardCharsets

/**
 * Created by Fenix on 03.05.2016.
 */
class DesignerTest {

    val pictureStream: String = "{ \"shape\": \"ellipse\", \"color\": \"red\", \"data\": { \"center\": { \"x\": \"100\", \"y\": \"400\" }, \"h_radius\": 50, \"v_radius\":80 }}\n"+
    "{ \"shape\": \"rectangle\", \"color\": \"blue\", \"data\": [ { \"x\": 10, \"y\": 5 }, { \"x\": 200, \"y\": 300 } ]}\n"+
    "{ \"shape\": \"triangle\", \"color\": \"green\", \"data\": [ { \"x\": 300, \"y\": 10 }, { \"x\": 600, \"y\": 10 }, { \"x\": 450, \"y\": 400} ]}\n"+
    "{ \"shape\": \"regular_polygon\", \"color\": \"black\", \"data\": { \"center\": { \"x\": 300, \"y\": 400 }, \"vertexes\": 8, \"radius\": 100}}\n"

    @Test
    fun testCreateDraft() {
        val designer = Designer(ShapeFactory())
        val draft = designer.createDraft(pictureStream.byteInputStream())
        val draftExpected = PictureDraft()
        draftExpected.addShape(Ellipse(ColorEnum.red, EllipseData(Point(100.0f, 400.0f), 50f, 80f)))
        draftExpected.addShape(Rectangle(ColorEnum.blue, RectangleData(Point(10f, 5f), Point(200f, 300f))))
        draftExpected.addShape(Triangle(ColorEnum.green, TriangleData(Point(300f, 10f), Point(600f, 10f), Point(450f, 400f))))
        draftExpected.addShape(RegularPolygon(ColorEnum.black, PolygonData(Point(300f, 400f), 8, 100f)))
        assertEquals(draft.getShapeCount(), draftExpected.getShapeCount())
        for (i in 0..(draft.getShapeCount() - 1)) {
            val shape = draft.getShape(i)
            val shapeExpected = draftExpected.getShape(i)
            assertEquals(shape.toString(), shapeExpected.toString())
        }
    }
}