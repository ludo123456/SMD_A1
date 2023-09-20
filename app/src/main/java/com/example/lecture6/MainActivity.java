package com.example.lecture6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the "Forgot Your Password?" button by its ID
        View buttonForgotPassword = findViewById(R.id.buttonForgotPassword);
        View buttonSignUp = findViewById(R.id.buttonSignUp);
        View buttonLogin = findViewById(R.id.buttonLogin);
        // Set an OnClickListener for the button
        buttonForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an Intent to navigate to the ForgotPasswordActivity
                Intent intent = new Intent(MainActivity.this, ForgotPasswordActivity.class);

                // Start the ForgotPasswordActivity
                startActivity(intent);
            }
        });
        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an Intent to navigate to the ForgotPasswordActivity
                Intent intent = new Intent(MainActivity.this, Register.class);

                // Start the ForgotPasswordActivity
                startActivity(intent);
            }
        });
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an Intent to navigate to the ForgotPasswordActivity
                Intent intent = new Intent(MainActivity.this, editprofile.class);

                // Start the ForgotPasswordActivity
                startActivity(intent);
            }
        });



    }
}

