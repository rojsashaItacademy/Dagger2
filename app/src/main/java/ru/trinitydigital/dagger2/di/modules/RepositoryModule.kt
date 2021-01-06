package ru.trinitydigital.dagger2.di.modules

import dagger.Module
import dagger.Provides
import ru.trinitydigital.dagger2.data.*
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideRepository(service: RetrofitIteractor): RetrofitRepository {
        return RetrofitRepositoryImpl(service)
    }
}