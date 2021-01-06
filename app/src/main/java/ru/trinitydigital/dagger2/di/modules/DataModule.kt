package ru.trinitydigital.dagger2.di.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import ru.trinitydigital.dagger2.data.PrefsHelper
import javax.inject.Singleton

@Module
class DataModule {

    @Provides
    @Singleton
    fun provideSharedPreference(context: Context): PrefsHelper {
        return PrefsHelper(context)
    }
}