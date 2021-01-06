package ru.trinitydigital.dagger2

import android.app.Application
import ru.trinitydigital.dagger2.di.DaggerMainComponent
import ru.trinitydigital.dagger2.di.MainComponent
import ru.trinitydigital.dagger2.di.modules.AppModule

class Dagger2App : Application() {

    lateinit var mainComponent: MainComponent

    override fun onCreate() {
        super.onCreate()
        app = this
        mainComponent = DaggerMainComponent
            .builder()
            .appModule(AppModule(this))
            .build()
    }

    companion object {
        lateinit var app: Dagger2App
    }
}