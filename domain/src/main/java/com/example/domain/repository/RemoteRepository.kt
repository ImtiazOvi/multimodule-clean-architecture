package com.example.domain.repository

import androidx.lifecycle.LiveData
import com.example.entity.ApiResponse
import com.example.entity.PostItemApiEntity

interface RemoteRepository {
    fun fetchPostList():LiveData<ApiResponse<List<PostItemApiEntity>>>
}