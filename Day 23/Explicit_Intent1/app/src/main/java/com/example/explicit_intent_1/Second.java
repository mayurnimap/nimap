package com.example.explicit_intent_1;

import androidx.appcompat.app.AppCompatActivity;




import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    TextView secondtxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        secondtxt = findViewById(R.id.second_txt);

        Intent intent2 = getIntent();

        String title = intent2.getStringExtra("title");
        String name = intent2.getStringExtra("name");
        int roll = intent2.getIntExtra("rollno",0);

        secondtxt.setText("Rollno " + roll + " name " + name);


    }
}