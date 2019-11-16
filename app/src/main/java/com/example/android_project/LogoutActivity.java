package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LogoutActivity extends AppCompatActivity {
    TextView login_again;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);

        login_again = findViewById(R.id.loginAgainTV);
        login_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login_again_intent = new Intent(LogoutActivity.this, LoginActivity.class);
                startActivity(login_again_intent);
            }
        });
    }
}
