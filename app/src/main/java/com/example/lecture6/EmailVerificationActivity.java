package com.example.lecture6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class EmailVerificationActivity extends AppCompatActivity {

    private EditText[] inputSpaces;
    private Button[] numpadButtons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_verification); // Replace with your XML layout file name

        View buttonBack = findViewById(R.id.buttonBack);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an Intent to navigate to the ForgotPasswordActivity
                Intent intent = new Intent(EmailVerificationActivity.this, MainActivity.class);

                // Start the ForgotPasswordActivity
                startActivity(intent);
            }
        });


        // Initialize EditText fields for input spaces
        inputSpaces = new EditText[5];
        inputSpaces[0] = findViewById(R.id.editTextCode1);
        inputSpaces[1] = findViewById(R.id.editTextCode2);
        inputSpaces[2] = findViewById(R.id.editTextCode3);
        inputSpaces[3] = findViewById(R.id.editTextCode4);
        inputSpaces[4] = findViewById(R.id.editTextCode5);

        // Initialize numpad buttons
        numpadButtons = new Button[11]; // Including 0 and Back button
        numpadButtons[0] = findViewById(R.id.button0);
        numpadButtons[1] = findViewById(R.id.button1);
        numpadButtons[2] = findViewById(R.id.button2);
        numpadButtons[3] = findViewById(R.id.button3);
        numpadButtons[4] = findViewById(R.id.button4);
        numpadButtons[5] = findViewById(R.id.button5);
        numpadButtons[6] = findViewById(R.id.button6);
        numpadButtons[7] = findViewById(R.id.button7);
        numpadButtons[8] = findViewById(R.id.button8);
        numpadButtons[9] = findViewById(R.id.button9);
        numpadButtons[10] = findViewById(R.id.buttonremove);


        for (int i = 0; i < 11; i++) {
            final int finalI = i;
            numpadButtons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    for (EditText inputSpace : inputSpaces) {
                        if (inputSpace.getText().toString().isEmpty()) {
                            if (finalI == 10) {

                                String text = inputSpace.getText().toString();
                                if (!text.isEmpty()) {
                                    inputSpace.setText("");
                                }
                            } else {
                                inputSpace.append(String.valueOf(finalI));
                            }
                            break; // Break the loop after filling one input space
                        }
                    }
                }
            });
        }
    }
}

