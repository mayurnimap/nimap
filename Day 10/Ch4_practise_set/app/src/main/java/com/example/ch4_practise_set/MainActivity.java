package com.example.ch4_practise_set;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private String [] questions = {"java is platfrom indepedent ?" ,
                                "java supports multiple inheritance ?",
                                "java is made using python ?",
                                "java is person ?",
                                "java support abstract class"};

    private boolean [] answers = {true,true,false,false,true};

    private int score = 0;
    private int index = 0;
    Button yes;
    Button no;


    TextView question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);

        question = findViewById(R.id.question);
        question.setText(questions[0]);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(index<=questions.length-1)
                {
                    if(answers[index]==true)
                    {
                        score++;
                    }

                    index++;

                    if(index<=questions.length-1)
                    {
                        question.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "your score is " + score + " out of " + questions.length, Toast.LENGTH_SHORT).show();
                    }

                }

                else {
                    Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });


        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(index<=questions.length-1)
                {
                    if(answers[index]==false)
                    {
                        score++;
                    }

                    index++;

                    if(index<=questions.length-1)
                    {
                        question.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "your score is " + score + " out of " + questions.length, Toast.LENGTH_SHORT).show();
                    }

                }

                else {
                    Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}