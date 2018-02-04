package com.example.manasyebukit.knowmore;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    private TextView textName,textScore,textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent=getIntent();
        String name = intent.getStringExtra("name");
        int score = intent.getIntExtra("score",0);
        textName = findViewById(R.id.name);
        textScore = findViewById(R.id.score);
        textResult = findViewById(R.id.analysis);

        textName.setText(name);
        textScore.setText("Your score is :" + Integer.toString(score*10));

        if(score <= 3){
            textScore.setTextColor(Color.parseColor("#D50000"));
            textResult.setText("Your score is below 40\nYou need to learn more");
        }
        else if(score <=7){
            textScore.setTextColor(Color.parseColor("#F57C00"));
            textResult.setText("Your score is below 80 but greater than 30\nKeep learning and improve yourself");
        }
        else{
            textScore.setTextColor(Color.parseColor("#33691E"));
            textResult.setText("Good job,you enter the phase of guru");
        }

    }
}
