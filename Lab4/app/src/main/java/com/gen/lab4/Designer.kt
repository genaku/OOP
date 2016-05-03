package com.gen.lab4

import java.io.InputStream

/**
 * Created by Fenix on 24.04.2016.
 */
class Designer(val shapeFactory: IShapeFactory): IDesigner {
    override fun createDraft(stream: InputStream): PictureDraft {
        val pictureDraft = PictureDraft()
        stream.reader().forEachLine {
            val shape = shapeFactory.createShape(it)
            if (shape != null)
                pictureDraft.addShape(shape)
        }
        return pictureDraft
    }
}