package com.example.ch_5_ps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Contact o1 = new Contact(1,"9898989898","mayur");
    Contact o2 = new Contact(2,"9898989898","mayur");
    Contact o3 = new Contact(3,"9898989898","mayur");
    Contact o4 = new Contact(4,"9898989898","mayur");
    Contact o5 = new Contact(5,"9898989898","mayur");
    Contact o6 = new Contact(6,"9898989898","mayur");
    Contact o7 = new Contact(7,"9898989898","mayur");
    Contact o8 = new Contact(8,"9898989898","mayur");
    Contact o9 = new Contact(9,"9898989898","mayur");
    Contact o10 = new Contact(10,"9898989898","mayur");
    Contact o11 = new Contact(11,"9898989898","mayur");
    Contact o12 = new Contact(12,"9898989898","mayur");
    Contact o13 = new Contact(13,"9898989898","mayur");
    Contact o14 = new Contact(14,"9898989898","mayur");
    Contact o15 = new Contact(15,"9898989898","mayur");
    Contact o16 = new Contact(16,"9898989898","mayur");


    Contact [] contacts = {o1,o2,o3,o4,o5,o6,o7,o8,o9,o10,o11,o12,o13,o14,o15,o16};

    RecyclerView recyclerView;

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        CustomAdapter ad = new CustomAdapter(contacts);
        recyclerView.setAdapter(ad);

//        to place horizontal line after every contact

        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));




    }
}