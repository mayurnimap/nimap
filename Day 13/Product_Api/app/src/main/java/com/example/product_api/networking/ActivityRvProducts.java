package com.example.product_api.networking;

import android.os.Bundle;
import android.widget.Toast;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.product_api.R;
import com.example.product_api.adapters.RVRetrofitAdapter;
import com.example.product_api.models.ResponseRetrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ActivityRvProducts extends AppCompatActivity {

    RecyclerView rvProduct;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv_products);
        rvProduct = findViewById(R.id.rvProducts);

        getProducts();


    }

    private void getProducts()
    {
        Call<List<ResponseRetrofit>> apiCall = RetrofitClient.getInstance().getApis().getProducts();
        apiCall.enqueue(new Callback<List<ResponseRetrofit>>() {
            @Override
            public void onResponse(Call<List<ResponseRetrofit>> call, Response<List<ResponseRetrofit>> response) {
                List<ResponseRetrofit> productResults = response.body();
                Toast.makeText(ActivityRvProducts.this, "Got Products", Toast.LENGTH_SHORT).show();
//                setAdapter(productResults);
            }

            @Override
            public void onFailure(Call<List<ResponseRetrofit>> call, Throwable t) {
                System.out.println("Exception: "+t.getMessage());

                Toast.makeText(ActivityRvProducts.this, "Error", Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void setAdapter(List<ProductResult> productResults)
    {
        rvProduct.setLayoutManager(new LinearLayoutManager(this));
        RVRetrofitAdapter rvRetrofitAdapter = new RVRetrofitAdapter(this,productResults);
        rvProduct.setAdapter(rvRetrofitAdapter);
    }

}
