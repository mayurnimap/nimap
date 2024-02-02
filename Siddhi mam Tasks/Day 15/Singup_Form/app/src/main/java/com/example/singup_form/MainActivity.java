package com.example.singup_form;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Spinner city ;
    String [] array;

    EditText fullname;
    EditText phone;

    EditText add;

    RadioGroup gender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



//        for dropdown function in state section

        city = findViewById(R.id.city);

        array = getResources().getStringArray(R.array.City_names);

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.spinner_dropdown, array);

        city.setAdapter(adapter);


//===============================================================================================================================

    fullname = findViewById(R.id.fullname);
    phone = findViewById(R.id.phone);
    add = findViewById(R.id.add);
    gender = findViewById(R.id.gender);
        
        

    }

    public void onSubmit(View view)
    {
        if(isInputValid())
        {

//            right now we dont have any usecase of these two lines .. it is for the database
            String fullname1 = fullname.getText().toString();
            String phonenumber1 = phone.getText().toString();
        }
    }


    private boolean isInputValid()
    {


//        validate full name


        boolean isValid =true;
        if(TextUtils.isEmpty(fullname.getText()))
        {
            fullname.setError("please enter your full name");
            isValid=false;

        }
        else {
            fullname.setError((null));

        }


//        validate phone number

        if(TextUtils.isEmpty(phone.getText()))
        {
            phone.setError("please enter the phone number");
            isValid=false;

        }

        else if (phone.length()!=10)
        {
            phone.setError("Enter the 10 Digit mobile number");
            isValid=false;
        }
        else {
            phone.setError(null);

        }

//        for addresss

        if(TextUtils.isEmpty(add.getText()))
        {
            add.setError("please enter the add");
            isValid=false;

        }
        else {
            add.setError(null);

        }


//        check if atleast one gender is selected

        int selectedGenderId = gender.getCheckedRadioButtonId();
        if (selectedGenderId == -1) {

            isValid = false;
            Toast.makeText(this, "Please select a gender", Toast.LENGTH_SHORT).show();
        }

//        check all the conditons are true

        if(isValid)
        {
            Toast.makeText(this, "Sucess", Toast.LENGTH_SHORT).show();
        }


        return isValid;

    }

}