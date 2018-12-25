package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ballButton;
        ballButton = findViewById(R.id.ballButton);

        final ImageView balaButton = findViewById(R.id.main_ball);

        final int [] bolaArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        ballButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ball", "Tombol sudah ditekan");
                Random randomNumberCraeator = new Random();
                int angka = randomNumberCraeator.nextInt(5);
                Log.d("Bola","Angka teracak adalah " + angka);
                balaButton.setImageResource(bolaArray[angka]);
            }
        });
    }
}
