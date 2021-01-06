package ru.trinitydigital.dagger2.di

import dagger.Component
import ru.trinitydigital.dagger2.di.modules.*
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        NetworkModule::class,
        InteractorModule::class,
        RepositoryModule::class,
        DataModule::class
    ]
)
interface MainComponent {
    fun inject(injector: Injector)
}