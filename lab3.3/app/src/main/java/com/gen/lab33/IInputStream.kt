package com.gen.lab33

/**
 * Created by Fenix on 10.04.2016.
 */
interface IInputDataStream {
    fun isEOF(): Boolean
    fun readByte(): Byte
    fun readBlock(dstData: ByteArray, dataSize: Int)
}