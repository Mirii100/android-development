package com.example.mech_tran;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button goToLoginButton = findViewById(R.id.goToLoginButton);

        goToLoginButton.setOnClickListener(view -> {

                // Create a new Login instance with sample data
                Login login = new Login("joedoe", "jfjf@fj", "1237338r");

                // Save user data to SharedPreferences using Database class
                Database.saveUserData(MainActivity.this,login.getUsername(),login.getEmail(),login.getPhoneNumber());

                // Navigate to Login activity
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);

        });
    }
}
