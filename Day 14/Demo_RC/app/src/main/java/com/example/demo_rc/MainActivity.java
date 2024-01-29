package com.example.demo_rc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView_one;

    String name [] = {"mayur","mayur","mayur","mayur","mayur","mayur","mayur","mayur","mayur","mayur",};
    int [] images = {R.drawable.a,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.a,R.drawable.d,R.drawable.f};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView_one = findViewById(R.id.recyclerView);

        MyAdapter myAdapter = new MyAdapter(images,name);

        recyclerView_one.setLayoutManager(new LinearLayoutManager(this));

        recyclerView_one.setAdapter(myAdapter);


    }
}