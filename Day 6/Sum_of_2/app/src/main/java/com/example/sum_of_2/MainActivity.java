package com.example.sum_of_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextText2;

    private EditText editTextText3;

    private TextView textView2 ;

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextText2 = findViewById(R.id.editTextText2);
        editTextText3 = findViewById(R.id.editTextText3);
        textView2 = findViewById(R.id.textView2);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String a = editTextText2.getText().toString();
                String b = editTextText3.getText().toString();

                int m = Integer.parseInt(a);
                int n = Integer.parseInt(b);

                int c = m+n;

                textView2.setText("the Sum of 2 number is " + c );



            }
        });





    }

//    public void sum(View view)
//    {
//
//        String a = editTextText2.getText().toString();
//        String b = editTextText3.getText().toString();
//
//        int m = Integer.parseInt(a);
//        int n = Integer.parseInt(b);
//
//        int c = m+n;
//
//        textView2.setText("the Sum of 2 number is " + c );
//
//
//
//
//
//
//
//    }
}