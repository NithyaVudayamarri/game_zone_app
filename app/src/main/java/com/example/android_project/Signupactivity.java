package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Signupactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupactivity);
    }

    public void signBTNAction(View v) {

        SharedPreferences myData = getSharedPreferences("register details", Context.MODE_PRIVATE);
        SharedPreferences.Editor ed = myData.edit();
        EditText full_nameET = findViewById(R.id.full_nameET);
        EditText email_addressET = findViewById(R.id.email_addressET);
        EditText pwd = findViewById(R.id.passwordET);
        EditText re_pwd = findViewById(R.id.re_enter_passwordET);
        EditText mobile_numberET = findViewById(R.id.mobilenumberET);
        EditText gender_ET = findViewById(R.id.genderET);
        EditText country_ET = findViewById(R.id.countryET);
        ed.putString("full name", full_nameET.getText().toString());
        ed.putString("email address", email_addressET.getText().toString());
        ed.putString("password", pwd.getText().toString());
        ed.putString("re entered password", re_pwd.getText().toString());
        ed.putString("mobile number", mobile_numberET.getText().toString());
        ed.putString("gender", gender_ET.getText().toString());
        ed.putString("country", country_ET.getText().toString());
        ed.commit();
        Toast.makeText(getApplicationContext(), "Registered successfully!", Toast.LENGTH_SHORT).show();

        Intent home_intent = new Intent(this, HomepageActivity.class);
        startActivity(home_intent);

    }
}
