package com.example.intent_practise;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main2 extends AppCompatActivity {

    TextView ltext;
    Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen);

        ltext = findViewById(R.id.ltext);

        Intent ma = getIntent();

        result =ma.getDoubleExtra(MainActivity.operation,0.0);


        ltext.setText(String.format("YOUR ANSWERS IS " + result));
    }


}
