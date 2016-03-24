package com.gen.lab2

/**
 * Created by Fenix on 20.03.2016.
 */
interface IObserver<T> {

    fun update(data: T);

}