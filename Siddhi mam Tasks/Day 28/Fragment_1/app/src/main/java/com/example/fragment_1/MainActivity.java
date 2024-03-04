package com.example.fragment_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("www.google.com"));
        startActivity(intent);




        loadFrag(new Afragment(),0); //for default fragment set which will be display first to the user

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                loadFrag(new Afragment(), 1);



            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                loadFrag(new BFragment(),1);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                loadFrag(new CFragment(),1);

            }
        });
    }


        public void loadFrag(Fragment fragment, int flag)
        {

            FragmentManager fm = getSupportFragmentManager();              //here the method  return type is fragment so we r saving that in a fm vaiable
            FragmentTransaction ft = fm.beginTransaction();                //here he return type is trasaction which is in fragment manager class

            if (flag==0)
            {
                ft.add(R.id.container,fragment);                          // if we will keep adding then it will get complex so here we have taken the one int varible and set that variable 1 and default 0
                                                                          // if flag == 0 then it will add which we have set in the start ie default and then whatever will the it will just replace because we have set the value one
            }

            else
            {
                ft.replace(R.id.container,fragment);
            }

            ft.commit();


        }
    }

