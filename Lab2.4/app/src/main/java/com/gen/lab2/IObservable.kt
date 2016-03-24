package com.gen.lab2

/**
 * Created by Fenix on 20.03.2016.
 */
interface IObservable<T> {

    val place: Place

    fun registerObserver(observer: IObserver<T>);
    fun notifyObservers();
    fun removeObserver(observer: IObserver<T>);

}