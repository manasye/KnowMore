package com.example.manasyebukit.knowmore;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name;
    Button playBtn,hintBtn;
    ImageView logo;
    TextView enter;
    ImageView soundBtn;

    int sec;

    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        playBtn = findViewById(R.id.playButton);
        hintBtn = findViewById(R.id.hintButton);
        logo = findViewById(R.id.logo);
        enter = findViewById(R.id.enteryourname);
//        soundBtn = findViewById(R.id.soundBtn);

        mp = MediaPlayer.create(this, R.raw.lobby);
        if(mp.isPlaying() == false){
            mp.start();
        }

//        new CountDownTimer(6000,200){
////            @Override
////            public void onTick(long l)
////            {
////                sec++;
////                if(sec==4)
////                {
//////                    logo.setVisibility(View.VISIBLE);
////                }
////                else if(sec==7)
////                {
////                    enter.setVisibility(View.VISIBLE);
////                }
////                else if(sec==9)
////                {
////                    logo.setImageResource(R.drawable.logo3);
////
////                }
////            }
////            @Override
////            public void onFinish()
////            {
////                name.setVisibility(View.VISIBLE);
////                playBtn.setVisibility(View.VISIBLE);
////                hintBtn.setVisibility(View.VISIBLE);
////            }
////        }.start();

        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,QuizApp.class);
                String strName = name.getText().toString();
                if(strName.matches("")){strName = "Anonymous";}
                intent.putExtra("name",strName);
                startActivity(intent);
            }
        });

        hintBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this,Hint.class);
                startActivity(intent2);
            }
        });

//        soundBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(mp != null){
//                    mp.stop();
//                    mp.release();
//                    mp = null;
//                    s.setImageDrawable(R.drawable.nosound);
//
//                } else {
//                    mp = MediaPlayer.create(this, R.raw.lobby);
//                    mp.start();
//                    soundBtn.setImageDrawable(R.drawable.sound);
//                }
//            }
//        });

    }

    @Override
    protected void onDestroy() {
        super.onStop();
        mp.stop();
    }

}
