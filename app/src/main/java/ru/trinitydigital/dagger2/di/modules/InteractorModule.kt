package ru.trinitydigital.dagger2.di.modules

import dagger.Module
import dagger.Provides
import ru.trinitydigital.dagger2.data.RetrofitApi
import ru.trinitydigital.dagger2.data.RetrofitIteractor
import ru.trinitydigital.dagger2.data.RetrofitIteractorImpl
import javax.inject.Singleton

@Module
class InteractorModule {

    @Provides
    @Singleton
    fun provideIteractor(service: RetrofitApi): RetrofitIteractor {
        return RetrofitIteractorImpl(service)
    }
}