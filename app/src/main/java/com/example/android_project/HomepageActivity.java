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

    public void twoPlayerBtnAction(View v) {
        Intent two_player_intent = new Intent(this, TwoPlayerGameActivity.class);
        startActivity(two_player_intent);
    }

    public void threePlayerBtnAction(View v) {
        Intent three_player_intent = new Intent(this, ThreePlayerGameActivity.class);
        startActivity(three_player_intent);
    }

}
