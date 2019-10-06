package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LogoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);
    }

    public void login_again_btn_onClick(View v) {
        Intent login_again_intent = new Intent(this,LoginActivity.class);
        startActivity(login_again_intent);
    }

}
