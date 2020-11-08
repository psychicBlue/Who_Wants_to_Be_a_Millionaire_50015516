package com.example.whowantstobeamillionaire_50015516;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class q3_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3_);

        String q1 = "What is the name of Han Solo’s ship?";
        String ans = "Millennium Falcon";

        Button confBtn = findViewById(R.id.confirmBtn);
        TextView qbox = findViewById(R.id.q1Text);

        RadioButton option1 = findViewById(R.id.option1);
        RadioButton option2 = findViewById(R.id.option2);
        RadioButton option3 = findViewById(R.id.option3);
        RadioButton option4 = findViewById(R.id.option4);

        qbox.setText(q1);

        option1.setText("Flagship");
        option2.setText("Patrol Cruiser");
        option3.setText("Empire Ship");
        option4.setText("Millennium Falcon");

        confBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                //Move to quiz game after reading rules
                RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radGroup);
                int radioButtonID = radioGroup.getCheckedRadioButtonId();
                RadioButton radioButton = (RadioButton) radioGroup.findViewById(radioButtonID);
                String selectedText = (String) radioButton.getText().toString();

                Context context = getApplicationContext();
                CharSequence text = selectedText;

                if(text == ans) {

                    Toast toast = Toast.makeText(context, "Correct Answer!", Toast.LENGTH_SHORT);
                    toast.show();
                    startActivity(new Intent(q3_Activity.this, q4_Activity.class)); //Use intent to move to next question
                } else {
                    Toast toast = Toast.makeText(context, "Wrong Answer!", Toast.LENGTH_SHORT);
                    toast.show();
                    startActivity(new Intent(q3_Activity.this, loseActivity.class)); //Use intent to move to losing screen
                }
            }
        });
    }
}