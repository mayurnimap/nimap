package com.example.intent_practise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText first_number;
    EditText second_number;

    public static final String operation = "mc";
    String str1, str2;

    Double first, second, result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first_number = findViewById(R.id.first_number);
        second_number = findViewById(R.id.second_number);
    }



    public void add(View v) {
        Toast.makeText(this, "Adding two number", Toast.LENGTH_SHORT).show();


        str1 = first_number.getText().toString();
        str2 = second_number.getText().toString();

        first = Double.parseDouble(str1);
        second = Double.parseDouble(str2);

        result = first + second;

        Intent i = new Intent(this, Main2.class);
        i.putExtra(operation, result);


        startActivity(i);


    }

    public void divide(View v)
    {
        Toast.makeText(this, "Dividing two numbers", Toast.LENGTH_SHORT).show();

        str1 = first_number.getText().toString();
        str2 = second_number.getText().toString();

        first = Double.parseDouble(str1);
        second = Double.parseDouble(str2);

        result = first / second;

        Intent i = new Intent(this, Main2.class);
        i.putExtra(operation, result);


        startActivity(i);
    }

    public void multiply(View v)
    {

        Toast.makeText(this, "dividing two numbers", Toast.LENGTH_SHORT).show();
        str1 = first_number.getText().toString();
        str2 = second_number.getText().toString();

        first = Double.parseDouble(str1);
        second = Double.parseDouble(str2);

        result = first * second ;

        Intent i = new Intent(this, Main2.class);
        i.putExtra(operation, result);


        startActivity(i);
    }


}