package com.example.api.module

import com.example.api.service.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {
    @Provides
    fun provideCommonApi(
        retrofit: Retrofit
    ):ApiService = retrofit.create(ApiService::class.java)

}