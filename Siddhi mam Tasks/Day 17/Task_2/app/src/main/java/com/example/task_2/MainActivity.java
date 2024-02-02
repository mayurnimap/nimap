package com.example.task_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String arr [] = {"Lorem", "Ipsum" , "Dolor" , "Sit"};
    int [] images ={R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four};
    String arr2 [] = {"Lorem ipsum dolor sit","amet consectetur adipiscing","elit Integer quis sagittis","est Pellentesque porttitor sollicitudin"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView =findViewById(R.id.recyclerview);

        ZAdapter myAdapter = new ZAdapter(arr,arr2,images);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(myAdapter);
















    }



}




