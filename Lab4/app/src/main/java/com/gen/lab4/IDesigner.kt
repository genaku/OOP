package com.gen.lab4

import java.io.BufferedInputStream

/**
 * Created by Fenix on 24.04.2016.
 */
interface IDesigner {
    fun createDraft(stream: BufferedInputStream): PictureDraft
}