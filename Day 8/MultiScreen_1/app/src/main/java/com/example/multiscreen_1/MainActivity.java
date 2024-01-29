package com.example.multiscreen_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name;

    public static final String EXTRA_NAME = "1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openActivity(View v )
    {
        Toast.makeText(this, "Loading", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(this,MainActivity2.class);

        name=findViewById(R.id.name);
        String nameText = name.getText().toString();
        i.putExtra(EXTRA_NAME,nameText);

        startActivity(i);
    }

}