package com.gen.lab2

import com.gen.lab2.Interfaces.IObservable

/**
 * Created by Fenix on 20.03.2016.
 */
abstract class Observable<T> : IObservable<T> {

    private val mObservers: MutableSet<IObserver<T>> = mutableSetOf()

    override fun registerObserver(observer: IObserver<T>) {
        synchronized(this) {
            mObservers.add(observer)
        }
    }

    override fun notifyObservers() {
        val data = getChangedData()
        val buffer = synchronized(this) {
            mObservers.toList()
        }
        for (observer in buffer.sortedBy { it.priority }) {
            observer.update(data);
        }
    }

    override fun removeObserver(observer: IObserver<T>) {
        synchronized(this) {
            mObservers.remove(observer)
        }
    }

    protected abstract fun getChangedData(): T
}