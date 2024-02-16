package com.example.api_calling;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofitclient {

    private static final String BASE_URL = "https://gorest.co.in/";
    private static Retrofit retrofit = null;

    public static Apiinterface getRetrofitClient()
    {
        if(retrofit==null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }

        return retrofit.create(Apiinterface.class);
    }
}
