package com.example.diceroller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class RollOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roll_one);

        ImageView dieNumberImageView = findViewById(R.id.die_image);
        Random rand = new Random();
        int randomDieNumber = rand.nextInt(6) +1;

        switch (randomDieNumber) {
            case 1:
                dieNumberImageView.setImageResource(R.drawable.dice1);
                break;
            case 2:
                dieNumberImageView.setImageResource(R.drawable.dice2);
                break;
            case 3:
                dieNumberImageView.setImageResource(R.drawable.dice3);
                break;
            case 4:
                dieNumberImageView.setImageResource(R.drawable.dice4);
                break;
            case 5:
                dieNumberImageView.setImageResource(R.drawable.dice5);
                break;
            case 6:
                dieNumberImageView.setImageResource(R.drawable.dice6);
                break;
            default:
                dieNumberImageView.setImageResource(R.drawable.stop);
        }

        Button resetButton = findViewById(R.id.reset_btn);
        resetButton.setOnClickListener(view -> {
            Intent resetIntent = new Intent(RollOneActivity.this, MainActivity.class);
            startActivity(resetIntent);
        });
    }
}