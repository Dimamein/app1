package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button clickMe;
        Button clickMeRepeat;
        final TextView CommunicateTextView;


        CommunicateTextView = findViewById(R.id.CommunicateTextView);

        clickMe = findViewById(R.id.clickMe);

        clickMeRepeat = findViewById(R.id.clickMeRepeat);

        clickMe.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        CommunicateTextView.setText("Is clicked");
                    }
                }
        );

        clickMeRepeat.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        CommunicateTextView.setText("Hello World!");
                    }
                }
        );





    }
}