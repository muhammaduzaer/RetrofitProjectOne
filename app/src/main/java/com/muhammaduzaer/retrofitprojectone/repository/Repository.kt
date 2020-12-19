package com.muhammaduzaer.retrofitprojectone.repository

import com.muhammaduzaer.retrofitprojectone.api.RetrofitInstance
import com.muhammaduzaer.retrofitprojectone.model.Post
import retrofit2.Response

class Repository {

    suspend fun getPost(): Response<Post> {
        return RetrofitInstance.api.getPost()
    }

    suspend fun getPost2(number: Int): Response<Post> {
        return RetrofitInstance.api.getPost2(number)
    }
}