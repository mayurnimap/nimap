package com.example.multiscreen_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView z ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        z = findViewById(R.id.textView2);

        Intent ma = getIntent();

    String result = ma.getStringExtra(MainActivity.MEME);


     z.setText("your age is " + result);


    }
}