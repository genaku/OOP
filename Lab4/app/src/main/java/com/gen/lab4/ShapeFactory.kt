package com.gen.lab4

import com.gen.lab4.Shapes.*
import com.github.salomonbrys.kotson.*
import com.google.gson.*

/**
 * Created by Fenix on 24.04.2016.
 */
class ShapeFactory : IShapeFactory {
/*
    val jsonTriangle by lazy {
        GsonBuilder()
                .registerTypeAdapter<TriangleData> {

                    write {
                        beginObject()
                        value(it.vertex1.x)
                        value(it.vertex1.y)
                        endObject()
                        beginObject()
                        value(it.vertex2.x)
                        value(it.vertex2.y)
                        endObject()
                        beginObject()
                        value(it.vertex3.x)
                        value(it.vertex3.y)
                        endObject()
                    }

                    read {
                        beginObject()
                        val x1 = nextInt()
                        val y1 = nextInt()
                        endObject()
                        beginObject()
                        val x2 = nextInt()
                        val y2 = nextInt()
                        endObject()
                        beginObject()
                        val x3 = nextInt()
                        val y3 = nextInt()
                        endObject()
                        TriangleData(Point(x1, y1), Point(x2, y2), Point(x3, y3))
                    }

                }
                .create()
    }
*/
    override fun createShape(description: String): Shape {

        val parser =  JsonParser();
        val jsonObj = parser.parse(description)
        val shapeType = ShapeType.valueOf(jsonObj["shape"].asString)
        val color = ColorEnum.valueOf(jsonObj["color"].asString)
        val data = jsonObj["data"]

        return when (shapeType) {
            //ShapeType.rectangle -> Rectangle(shapeData as RectangleData)
            //ShapeType.ellipse -> Ellipse(shapeData as EllipseData)
            //ShapeType.regular_polygon -> RegularPolygon(shapeData as PolygonData)
            ShapeType.triangle -> Triangle(color, readTriangleData(data))
            else -> Triangle(color, readTriangleData(data))
        }
    }

    private fun readTriangleData(json: JsonElement): TriangleData {
        val array = json.asJsonArray
        return TriangleData(
                Point(array[0]["x"].asInt,array[0]["y"].asInt),
                Point(array[1]["x"].asInt,array[1]["y"].asInt),
                Point(array[2]["x"].asInt,array[2]["y"].asInt)
        )
    }

}