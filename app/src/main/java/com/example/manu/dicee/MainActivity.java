package com.example.manu.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static android.R.attr.left;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button rollButton;
        rollButton = (Button)findViewById(R.id.buttonRoll);
        final ImageView LeftDice = (ImageView)findViewById(R.id.imageView_LeftDice);
        final ImageView RightDice = (ImageView) findViewById(R.id.imageView_rightDice);

        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee", "the button had been clicked ");
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);
                Log.d("Dicee " , "the random number Generated is " + number);
                LeftDice.setImageResource(diceArray[number]);
                number= randomNumberGenerator.nextInt(6);
                RightDice.setImageResource(diceArray[number]);

            }
        });



    }

}
