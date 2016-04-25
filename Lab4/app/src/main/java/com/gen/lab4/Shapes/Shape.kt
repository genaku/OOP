package com.gen.lab4.Shapes

import com.gen.lab4.ColorEnum
import com.gen.lab4.ICanvas

/**
 * Created by Fenix on 24.04.2016.
 */
abstract class Shape(val color: ColorEnum) {
    abstract fun draw(canvas: ICanvas)
}
