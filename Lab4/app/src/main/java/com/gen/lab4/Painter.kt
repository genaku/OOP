package com.gen.lab4

/**
 * Created by Fenix on 03.05.2016.
 */
class Painter : IPainter{
    override fun drawPicture(draft: PictureDraft, canvas: ICanvas) {
        for (i in 0..(draft.getShapeCount() - 1)) {
            draft.getShape(i).draw(canvas)
        }
    }
}