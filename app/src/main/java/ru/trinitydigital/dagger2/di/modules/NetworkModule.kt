package ru.trinitydigital.dagger2.di.modules

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ru.trinitydigital.dagger2.data.RetrofitApi
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit(client: OkHttpClient): RetrofitApi {
        return Retrofit.Builder()
            .baseUrl("https://api.sambo.beta.trinitydigital.ru/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
            .create(RetrofitApi::class.java)
    }

    @Provides
    @Singleton
    fun provideOkHttp(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor())
            .build()
    }
}