package com.example.api_calling;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Apiinterface {

    @GET("/public/v2/users")
    Call<List<Data>> getData();
}
