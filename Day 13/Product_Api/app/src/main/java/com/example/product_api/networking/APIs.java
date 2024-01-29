package com.example.product_api.networking;

import com.example.product_api.models.ResponseRetrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIs {

    String BASE_URL = "https://dummyjson.com/";

    @GET("products")
    Call<List<ResponseRetrofit>> getProducts();


}
