package com.gen.lab4

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.io.InputStream

class MainActivity : AppCompatActivity() {

    val mDesigner = Designer(ShapeFactory())
    val mPainter = Painter()
    val mCanvas = AndroidCanvas()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener { loadAndDraw("picture.txt") }
    }

    fun loadAndDraw(filename: String) {
        drawPicture(assets.open(filename))
    }

    fun drawPicture(stream: InputStream) {
        mPainter.drawPicture(mDesigner.createDraft(stream), mCanvas)
        imageView.setImageBitmap(mCanvas.getBitmap())
        imageView.invalidate()
    }
}
