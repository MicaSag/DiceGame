package com.michael.sagot.dicegame.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.michael.sagot.dicegame.R;

public class MainActivity extends AppCompatActivity {

    protected Button mButton6;  // Button for 6 sided dice choice
    protected Button mButton20; // Button for 20 sides dice choice

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // >> Management of the Button for 6 sided dice choice <<
        mButton6 = findViewById(R.id.activity_main_6dices_btn);
        // Encoding the Listener of the button
        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            // Action during a click on the button
            public void onClick(View view) {
                // Create a Intent for call RollActivity
                Intent intent = new Intent(MainActivity.this,RollActivity.class);
                // Send the type of the Roll
                intent.putExtra("max", 6);
                startActivity(intent);
            }
        });

        // >> Management of the Button for 20 sided dice choice <<
        mButton20 = findViewById(R.id.activity_main_20dices_btn);
        // Encoding the Listener of the button
        mButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a Intent for call RollActivity
                Intent intent = new Intent(MainActivity.this,RollActivity.class);
                // Send the type of the Roll
                intent.putExtra("max", 20);
                startActivity(intent);
            }
        });
    }
}



