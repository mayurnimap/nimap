package com.example.retrofit_example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProgressBar progressBar;

    LinearLayoutManager layoutManager;

    PostsAdapter adapter;

    List<Posts> postsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        progressBar = findViewById(R.id.progressBar);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new PostsAdapter(postsList);
        recyclerView.setAdapter(adapter);

        fetchPosts();
    }

    private void fetchPosts(){

        progressBar.setVisibility(View.VISIBLE);
        RetrofitClient.getRetrofitClient().getPosts().enqueue(new Callback<List<Posts>>() {
            @Override
            public void onResponse(Call<List<Posts>> call, Response<List<Posts>> response) {
                if(response.isSuccessful() && response.body()!= null)
                {
                    postsList.addAll(response.body());
                    adapter.notifyDataSetChanged(); //it will notify the adapter that changes have been made..
                    progressBar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onFailure(Call<List<Posts>> call, Throwable t) {

                progressBar.setVisibility(View.GONE);
                Toast.makeText(MainActivity.this, "Error" + t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}