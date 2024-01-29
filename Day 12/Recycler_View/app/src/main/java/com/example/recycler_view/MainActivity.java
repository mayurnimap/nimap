package com.example.recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String arr  [] = {"item1","item2","item3","item4","item5","item6","item7","item8","item9","item10","item11","item12","item13",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        this steps is mandatory here because we r telling that what type of layout manager we want ... eg = linear layout

        CustomAdapter c = new CustomAdapter(arr);
//        here we are passing our array data into custome adapter
        recyclerView.setAdapter(c);
    }
}