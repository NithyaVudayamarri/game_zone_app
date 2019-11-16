package com.example.android_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;

public class Registeractivity extends AppCompatActivity {

    EditText username_et;
    EditText password_et;
    EditText email_et;
    Button register_btn;
    TextView login_again_tv;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username_et = findViewById(R.id.usernameET);
        password_et = findViewById(R.id.passwordET);
        email_et = findViewById(R.id.emailET);
        register_btn = findViewById(R.id.registerBTN);
        login_again_tv = findViewById(R.id.loginHereTV);



        login_again_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent existing_user_intent = new Intent(Registeractivity.this, LoginActivity.class);
                startActivity(existing_user_intent);
            }
        });

    }

    public Boolean validate() {
        Boolean result = false;

        String name = username_et.getText().toString();
        String pwd = password_et.getText().toString();
        String email = email_et.getText().toString();

        if (name.isEmpty() || pwd.isEmpty() || email.isEmpty()) {
            Toast.makeText(this, "Please enter the details." , Toast.LENGTH_SHORT).show();
        }
        else {
            result = true;
        }
        return result;
    }

}
