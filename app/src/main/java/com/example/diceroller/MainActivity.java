package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView dieNumberTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        dieNumberTextView = findViewById(R.id.die_number);
//        dieNumberTextView.setText("3");


        setContentView(R.layout.activity_main);


//        Button roll1Button = (Button) findViewById(R.id.roll1btn);
//        roll1Button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                getSupportFragmentManager().beginTransaction().add(R.id.ConstraintLayout, new OneDieFragment()).commit();
//            }
//        });
//
        Button roll1Button = (Button) findViewById(R.id.roll_1_die_btn);
        roll1Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RollOneActivity.class);
                startActivity(intent);
            }
        });

        Button roll2Button = (Button) findViewById(R.id.roll_2_dice_btn);
        roll2Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RollTwoActivity.class);
                startActivity(intent);
            }
        });
    }

}