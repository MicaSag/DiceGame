package com.michael.sagot.dicegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.security.SecureRandom;

public class RollActivity extends AppCompatActivity {

    protected Button mButtonRollDice;
    protected TextView mTitleDice;
    protected TextView mResultDice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roll);

        // >> Management of the TextView of the dice title <<
        mTitleDice = findViewById(R.id.activity_roll_diceTitle_txt);
        mTitleDice.setText("6 sided dice");

        // >> Management of the TextView of the dice result <<
        mResultDice = findViewById(R.id.activity_roll_diceResult_txt);
        mResultDice.setText("");

        // >> Management of the Button for Roll the dice <<
        mButtonRollDice = findViewById(R.id.activity_roll_buttonRoll_btn);
        // Encoding the Listener of the button
        mButtonRollDice.setOnClickListener(new View.OnClickListener() {
            @Override
            // Action during a click on the button
            public void onClick(View view) {
                // Acquisition of a random value between 1 and 6
                SecureRandom random = new SecureRandom();
                mResultDice.setText(String.valueOf(random.nextInt(6) + 1));
            }
        });
    }
}
