package ru.trinitydigital.dagger2.di

import ru.trinitydigital.dagger2.Dagger2App
import ru.trinitydigital.dagger2.data.*
import javax.inject.Inject

inline fun <T> inject(crossinline block: Injector.() -> T): Lazy<T> = lazy { Injector().block() }

class Injector {

    @Inject
    lateinit var retrofitIterator: RetrofitIteractor

    @Inject
    lateinit var retrofitRepository: RetrofitRepository

    @Inject
    lateinit var preference: PrefsHelper

    init {
        Dagger2App.app.mainComponent.inject(this)
    }
}