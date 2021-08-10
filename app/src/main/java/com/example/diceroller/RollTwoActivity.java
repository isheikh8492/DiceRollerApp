package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class RollTwoActivity extends AppCompatActivity {

    private Button resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_roll_two);

        ImageView dice1NumberImageView = findViewById(R.id.dice_1_image);
        ImageView dice2NumberImageView = findViewById(R.id.dice_2_image);

        Random rand = new Random();
        int randomDice1Number = rand.nextInt(6) +1;
        int randomDice2Number = rand.nextInt(6) +1;

        switch (randomDice1Number) {
            case 1:
                dice1NumberImageView.setImageResource(R.drawable.dice1);
                break;
            case 2:
                dice1NumberImageView.setImageResource(R.drawable.dice2);
                break;
            case 3:
                dice1NumberImageView.setImageResource(R.drawable.dice3);
                break;
            case 4:
                dice1NumberImageView.setImageResource(R.drawable.dice4);
                break;
            case 5:
                dice1NumberImageView.setImageResource(R.drawable.dice5);
                break;
            case 6:
                dice1NumberImageView.setImageResource(R.drawable.dice6);
                break;
            default:
                dice1NumberImageView.setImageResource(R.drawable.stop);
        }

        switch (randomDice2Number) {
            case 1:
                dice2NumberImageView.setImageResource(R.drawable.dice1);
                break;
            case 2:
                dice2NumberImageView.setImageResource(R.drawable.dice2);
                break;
            case 3:
                dice2NumberImageView.setImageResource(R.drawable.dice3);
                break;
            case 4:
                dice2NumberImageView.setImageResource(R.drawable.dice4);
                break;
            case 5:
                dice2NumberImageView.setImageResource(R.drawable.dice5);
                break;
            case 6:
                dice2NumberImageView.setImageResource(R.drawable.dice6);
                break;
            default:
                dice2NumberImageView.setImageResource(R.drawable.stop);
        }

        resetButton = findViewById(R.id.reset_btn);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resetIntent = new Intent(RollTwoActivity.this, MainActivity.class);
                startActivity(resetIntent);
                finish();
            }
        });
    }
}