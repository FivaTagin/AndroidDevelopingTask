package com.example.mydice;

import androidx.appcompat.app.AppCompatActivity;

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

        Button rollButton;

        // 利用於Acticity 建立的Buttom物件連結到function point 上
        rollButton = findViewById(R.id.rollbutton);

        final ImageView leftDice = (ImageView)findViewById(R.id.image_leftdice); // 左骰子連結
        final ImageView rightDice = (ImageView)findViewById(R.id.image_rightdice); // 右骰連結

        final int[] diceArray = {

                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("Dicee","The buttom has been triggered!");

                Random varRandomNum = new Random();
                int number = varRandomNum.nextInt(6);
                Log.d("Dicee", "Random Var :" + number);

                leftDice.setImageResource(diceArray[number]);

                int number2 = varRandomNum.nextInt(6);
                rightDice.setImageResource(diceArray[number2]);
            }
        });
    }


}