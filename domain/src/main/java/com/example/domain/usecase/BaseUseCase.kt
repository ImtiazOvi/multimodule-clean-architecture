package com.example.domain.usecase

import androidx.lifecycle.LiveData
import com.example.entity.ApiResponse

interface BaseUseCase
interface ApiUseCase<Params, Type> : BaseUseCase {
    fun execute(params: Params? = null): LiveData<ApiResponse<Type>>
}