package com.example.retrofitproduct

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response



class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var productAdapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        productAdapter = ProductAdapter(emptyList()) // Initialize with an empty list
        recyclerView.adapter = productAdapter

        fetchProducts()
    }

    private fun fetchProducts() {
        val call = RetrofitClient.api.getProducts()
        call.enqueue(object : Callback<List<Model>> {
            override fun onResponse(call: Call<List<Model>>, response: Response<List<Model>>) {
                if (response.isSuccessful) {
                    val products = response.body()
                    products?.let {
                        productAdapter.updateProducts(it)
                    }
                } else {
                    // Handle the error here
                    println("Error: ${response.errorBody()?.string()}")
                }
            }

            override fun onFailure(call: Call<List<Model>>, t: Throwable) {
                // Handle failure here
                t.printStackTrace()
            }
        })
    }
}




