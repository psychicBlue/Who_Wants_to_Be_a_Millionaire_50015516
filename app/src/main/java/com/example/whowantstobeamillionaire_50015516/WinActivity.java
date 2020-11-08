package com.example.whowantstobeamillionaire_50015516;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);

        Button restartBtn = findViewById(R.id.restartBtn2);

        restartBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                //Move to quiz game after reading rules
                startActivity(new Intent(WinActivity.this, q1_Activity.class)); //Use intent to move to first question

            }
        });

    }
}