package com.example.button_validation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        button = findViewById(R.id.button);

        // Initially disable the button
        button.setEnabled(false);

        // Listen for text changes in both username and password fields
        username.addTextChangedListener(textWatcher);
        password.addTextChangedListener(textWatcher);


    }

    // TextWatcher to listen for text changes in both username and password fields
    private TextWatcher textWatcher = new TextWatcher() {


        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {

            checkFields(username.getText().toString(), password.getText().toString());
        }


        // Method to check the validity of username and password
        private void checkFields(String usernameText, String passwordText) {
            // Check if both username and password fields are not empty
            if (!TextUtils.isEmpty(usernameText) && isValidPassword(passwordText)) {
                // Enable the button if conditions are met
                button.setEnabled(true);
            } else {
                // Otherwise, disable the button
                button.setEnabled(false);
            }
        }

        // Method to validate the password
        private boolean isValidPassword(String password) {
            // Check if password contains at least one uppercase letter, one special character, and one number
            return password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[^A-Za-z0-9]).{8,}$");
        }
    };
}