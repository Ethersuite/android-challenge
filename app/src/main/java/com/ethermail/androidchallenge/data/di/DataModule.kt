package com.ethermail.androidchallenge.data.di


import com.ethermail.androidchallenge.data.HOST_COINCAP
import com.ethermail.androidchallenge.data.CoincapService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DataModule {

    @Provides
    @Singleton
    fun provideCoincapService(): CoincapService {
        return Retrofit.Builder()
            .baseUrl(HOST_COINCAP)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoincapService::class.java)
    }
}