package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText mUsername_ET = findViewById(R.id.usernameET);
        EditText mPassword_ET = findViewById(R.id.passwordET);
        Button mLogin_BTN = findViewById(R.id.loginBTN);
        TextView mRegister_Here_TV = findViewById(R.id.registerHereTV);

        mRegister_Here_TV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent new_user_intent = new Intent(LoginActivity.this, Registeractivity.class);
                startActivity(new_user_intent);
            }
        });

    }

    public void loginBTNAction(View view){
        Intent home_intent = new Intent(this,HomepageActivity.class);
        startActivity(home_intent);
    }

}
