package com.muhammaduzaer.retrofitprojectone.repository

import com.muhammaduzaer.retrofitprojectone.api.RetrofitInstance
import com.muhammaduzaer.retrofitprojectone.model.Post
import retrofit2.Response
import retrofit2.Retrofit

class Repository {

    suspend fun getPost(): Response<Post> {
        return RetrofitInstance.api.getPost()

    }
}