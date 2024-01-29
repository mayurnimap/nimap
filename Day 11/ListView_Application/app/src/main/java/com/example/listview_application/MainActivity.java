package com.example.listview_application;

import androidx.appcompat.app.AppCompatActivity;



import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String arr [] = {"mayur","sharma","jeet","jay","raj","vaibhav","shubham","usama","nimap","relince","airtel","jio","vodafone"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
//              Using built in Adapter
//        ArrayAdapter ad = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arr);
////                (android.R.layout.simple_list_item_1) this is built in layout
//        listView.setAdapter(ad);

//        Using Custome Adapter

        YashAdapter ya = new YashAdapter(this,R.layout.mayur_layout,arr);
        listView.setAdapter(ya);






    }
}