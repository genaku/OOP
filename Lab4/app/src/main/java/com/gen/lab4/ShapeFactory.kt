package com.gen.lab4

import com.gen.lab4.Const.ColorEnum
import com.gen.lab4.Const.ShapeType
import com.gen.lab4.Shapes.*
import com.github.salomonbrys.kotson.*
import com.google.gson.*

/**
 * Created by Fenix on 24.04.2016.
 */
class ShapeFactory : IShapeFactory {

    override fun createShape(description: String): Shape? {

        val parser = JsonParser();
        val jsonObj = parser.parse(description)
        val shapeType = ShapeType.valueOf(jsonObj["shape"].asString)
        val color = ColorEnum.valueOf(jsonObj["color"].asString)
        val data = jsonObj["data"]

        return when (shapeType) {
            ShapeType.rectangle -> Rectangle(color, readRectangleData(data))
            ShapeType.ellipse -> Ellipse(color, readEllipseData(data))
            ShapeType.regular_polygon -> RegularPolygon(color, readPolygonData(data))
            ShapeType.triangle -> Triangle(color, readTriangleData(data))
            else -> null
        }
    }

    private fun readTriangleData(json: JsonElement): TriangleData {
        val array = json.asJsonArray
        return TriangleData(
                Point(array[0]["x"].asFloat, array[0]["y"].asFloat),
                Point(array[1]["x"].asFloat, array[1]["y"].asFloat),
                Point(array[2]["x"].asFloat, array[2]["y"].asFloat)
        )
    }

    private fun readRectangleData(json: JsonElement): RectangleData {
        val array = json.asJsonArray
        return RectangleData(
                Point(array[0]["x"].asFloat, array[0]["y"].asFloat),
                Point(array[1]["x"].asFloat, array[1]["y"].asFloat)
        )
    }

    private fun readPolygonData(json: JsonElement): PolygonData {
        val center = json["center"].asJsonObject
        return PolygonData(
                Point(center["x"].asFloat, center["y"].asFloat),
                json["vertexes"].asInt,
                json["radius"].asFloat
        )
    }

    private fun readEllipseData(json: JsonElement): EllipseData {
        val center = json["center"].asJsonObject
        return EllipseData(
                Point(center["x"].asFloat, center["y"].asFloat),
                json["h_radius"].asFloat,
                json["v_radius"].asFloat
        )
    }

}