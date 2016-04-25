package com.gen.lab33

/**
 * Created by Fenix on 10.04.2016.
 */
interface IOutputDataStream {
    fun writeByte(data: Byte) :Boolean
    fun writeBlock(srcData: ByteArray, dataSize: Int): Boolean
}