package com.example.data.repoimpl

import androidx.lifecycle.LiveData
import androidx.lifecycle.map
import com.example.api.service.ApiService
import com.example.apiresponse.PostItemApiResponse
import com.example.data.mapper.PostApiMapper
import com.example.data.mapper.mapFromApiResponse
import com.example.data.wrapper.NetworkBoundResource
import com.example.domain.repository.RemoteRepository
import com.example.entity.ApiResponse
import com.example.entity.PostItemApiEntity
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class RemoteRepoImpl @Inject constructor(
    private val apiService: ApiService,
    private val postApiMapper: PostApiMapper
):RemoteRepository{
    override fun fetchPostList(): LiveData<ApiResponse<List<PostItemApiEntity>>> {
        return object : NetworkBoundResource<List<PostItemApiResponse>>(){
            override fun createCall(): Single<List<PostItemApiResponse>> {
                return apiService.fetchPostList()
            }
        }.asLiveData().map { mapFromApiResponse(it,postApiMapper)}
    }
}