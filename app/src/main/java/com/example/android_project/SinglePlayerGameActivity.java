package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SinglePlayerGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player_game);
    }

    public void playBtnAction(View v) {
        TextView progress_tv = findViewById(R.id.progressTV);
        progress_tv.setText("Work In Progress. Please Come Back Later!");
    }

}
