package com.example.lecture6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        // Find the "Sign Up" button by its ID
        View buttonSignUpForgot = findViewById(R.id.buttonGoBackForgot);

        // Set an OnClickListener for the button
        buttonSignUpForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an Intent to navigate back to the MainActivity
                Intent intent = new Intent(ForgotPasswordActivity.this, MainActivity.class);

                // Start the MainActivity
                startActivity(intent);
            }
        });
    }
}
