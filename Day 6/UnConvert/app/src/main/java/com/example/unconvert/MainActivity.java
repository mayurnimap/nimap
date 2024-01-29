package com.example.unconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editTextText;

    private TextView textView2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editTextText = findViewById(R.id.editTextText);
        textView2 = findViewById(R.id.textView2);


        //there are two ways using setonclicklistener and by using onclick attribure

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Toast.makeText(MainActivity.this, "Sucess", Toast.LENGTH_SHORT).show();
//                String s = editTextText.getText().toString();
//                int n = Integer.parseInt(s);
//
//                double result = n*2.205;
//
//                textView2.setText(result + " pounds");
//
//
//
//
//
//            }
//        });
    }


        public void calculator(View mayur)
        {
            String s = editTextText.getText().toString();
            int n = Integer.parseInt(s);

            double result = n*2.205;

            textView2.setText(result + " pounds");
        }
    }
