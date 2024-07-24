package com.example.retrofitproduct

import retrofit2.Call
import retrofit2.http.GET

interface APIServices {

    @GET("products")
    fun getProducts(): Call<List<Model>>
}