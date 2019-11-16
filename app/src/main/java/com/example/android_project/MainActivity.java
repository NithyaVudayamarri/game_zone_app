package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void signupbtn_onClick(View v) {
        Intent signup_intent = new Intent(this, Registeractivity.class);
        startActivity(signup_intent);
    }


    public void loginbtn_onClick(View v) {
        Intent login_intent = new Intent(this,LoginActivity.class);
        startActivity(login_intent);
    }

    public void logoutbtn_onClick(View v) {
        Intent logout_intent = new Intent(this,LogoutActivity.class);
        startActivity(logout_intent);
    }

}
