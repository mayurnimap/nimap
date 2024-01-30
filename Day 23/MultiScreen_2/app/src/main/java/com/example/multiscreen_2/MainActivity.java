package com.example.multiscreen_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text;

    public static final String MEME = "mc";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void age(View v)
    {
        Toast.makeText(this, "plz wait.... loading", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(this,MainActivity2.class);

        text = findViewById(R.id.editTextText);

        String c = text.getText().toString();

        i.putExtra(MEME,c);

        startActivity(i);






    }

}