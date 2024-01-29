package com.example.project_1;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void sendNow(View view)
    {
        Toast.makeText(this, "Data is sending....", Toast.LENGTH_SHORT).show();
    }

    public void receivedNow(View view)
    {
        Toast.makeText(this, "Data is Received....", Toast.LENGTH_SHORT).show();
    }

    public void deleteNow(View view)
    {
        Toast.makeText(this, "Data is Deleting....", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




}