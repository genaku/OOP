package com.gen.lab4

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Color
import android.view.View
import com.gen.lab4.Const.ColorEnum
import com.gen.lab4.Point

/**
 * Created by Fenix on 03.05.2016.
 */
class AndroidCanvas() : ICanvas {

    val mPaint = Paint()

    val mBitmap = Bitmap.createBitmap(800, 800, Bitmap.Config.ARGB_8888);
    val mCanvas = Canvas(mBitmap);


    override fun setColor(color: ColorEnum) {
        mPaint.color = when (color) {
            ColorEnum.blue -> Color.BLUE
            ColorEnum.black -> Color.BLACK
            ColorEnum.green -> Color.GREEN
            ColorEnum.pink -> Color.MAGENTA
            ColorEnum.red -> Color.RED
            ColorEnum.yellow -> Color.YELLOW
        }
        mPaint.isAntiAlias = true
    }

    override fun drawLine(from: Point, to: Point) {
        mCanvas.drawLine(from.x, from.y, to.x, to.y, mPaint)
    }

    override fun drawEllipse(center: Point, hRadius: Float, vRadius: Float) {
        mCanvas.drawOval(center.x - hRadius, center.y - vRadius, center.x + hRadius, center.y + vRadius, mPaint)
    }

    fun getBitmap(): Bitmap = mBitmap
}