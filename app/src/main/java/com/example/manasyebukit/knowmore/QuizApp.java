package com.example.manasyebukit.knowmore;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizApp extends AppCompatActivity {

    private QuestionLibrary myQuestionLib = new QuestionLibrary();
    private TextView myScore;
    private TextView myQuestion;
    private Button button1,quitBtn, button2,button3,button4;
    private String myAnswer="India";
    private String name;
    private int score;
    private int myQuestionNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_app);
        Intent intent=getIntent();
        name = intent.getStringExtra("name");
        TextView text = findViewById(R.id.name);
        text.setText(name);

        myScore = findViewById(R.id.score);
        myQuestion = findViewById(R.id.question);
        button1 = findViewById(R.id.choiceA);
        button2 = findViewById(R.id.choiceB);
        button3 = findViewById(R.id.choiceC);
        button4 = findViewById(R.id.choiceD);
        quitBtn = findViewById(R.id.quitBtn);

        updateQuestion();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(button1.getText() == myAnswer){
                    score += 1;
                    updateScore(score);
                    updateQuestion();
                    Toast.makeText(QuizApp.this,"Congrats you got the right answer",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizApp.this,"Oops you got it wrong.The correct answer is "+ myAnswer ,Toast.LENGTH_SHORT).show();
                    updateQuestion();

                }

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(button2.getText() == myAnswer){
                    score += 1;
                    updateScore(score);
                    updateQuestion();
                    Toast.makeText(QuizApp.this,"Congrats you got the right answer",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizApp.this,"Oops you got it wrong.The correct answer is "+ myAnswer ,Toast.LENGTH_SHORT).show();
                    updateQuestion();

                }

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(button3.getText() == myAnswer){
                    score += 1;
                    updateScore(score);
                    updateQuestion();
                    Toast.makeText(QuizApp.this,"Congrats you got the right answer",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizApp.this,"Oops you got it wrong.The correct answer is "+ myAnswer ,Toast.LENGTH_SHORT).show();
                    updateQuestion();

                }

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(button4.getText() == myAnswer){
                    score += 1;
                    updateScore(score);
                    updateQuestion();
                    Toast.makeText(QuizApp.this,"Congrats you got the right answer",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizApp.this,"Oops you got it wrong.The correct answer is "+ myAnswer ,Toast.LENGTH_SHORT).show();
                    updateQuestion();

                }

            }
        });

        quitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(QuizApp.this,Result.class);
                intent2.putExtra("name",name);
                intent2.putExtra("score",score);
                startActivity(intent2);
                finish();
            }
        });


    }

    private void updateQuestion(){

        if(myQuestionNum == 9){
            Intent intent2 = new Intent(QuizApp.this,Result.class);
            intent2.putExtra("name",name);
            intent2.putExtra("score",score);
            startActivity(intent2);
            finish();

        } else {
            myQuestion.setText(myQuestionLib.getQuestion(myQuestionNum));
            button1.setText(myQuestionLib.getChoice1(myQuestionNum));
            button2.setText(myQuestionLib.getChoice2(myQuestionNum));
            button3.setText(myQuestionLib.getChoice3(myQuestionNum));
            button4.setText(myQuestionLib.getChoice4(myQuestionNum));
            myAnswer = myQuestionLib.getAnswer(myQuestionNum);
            myQuestionNum += 1;
        }

    }

    private void updateScore(int point){

        if(point > 3){
            myScore.setTextColor(Color.parseColor("#F57C00"));
        }
        if(point >= 7){
            myScore.setTextColor(Color.parseColor("#33691E"));
        }
        myScore.setText("" + point*10);

    }
}
