package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomepageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
    }

    public void singlePlayerBtnAction(View v) {
        Intent single_player_intent = new Intent(this, SinglePlayerGameActivity.class);
        startActivity(single_player_intent);
    }

}
