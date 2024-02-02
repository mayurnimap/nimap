package com.example.recycler_task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;


    String[] text1 = {"Thunder Bolt BlasterBlast..."};
    String[] text2 = {"Team Rockstar -120 Members"};
    String[] text3 = {"05 may 23-28 may 23, 04:00pm -04"};
    int[] images = {R.drawable.box};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        // Assuming you have 13 items, you can create an array for images and texts
        String[] text1Array = new String[13];
        String[] text2Array = new String[13];
        String[] text3Array = new String[13];
        int[] imagesArray = new int[13];

        // Fill the arrays with the same text and image data for 13 times
        for (int i = 0; i < 13; i++) {
            text1Array[i] = text1[0];
            text2Array[i] = text2[0];
            text3Array[i] = text3[0];
            imagesArray[i] = images[0];
        }

        // Set up the adapter with the data arrays
        MyAdapter adapter = new MyAdapter(this, text1Array, text2Array, text3Array, imagesArray);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
