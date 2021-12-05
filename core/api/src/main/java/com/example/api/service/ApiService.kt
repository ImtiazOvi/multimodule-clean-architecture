package com.example.api.service

import com.example.apiresponse.PostItemApiResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface ApiService {
    @GET("/posts")
    fun fetchPostList():Single<List<PostItemApiResponse>>
}