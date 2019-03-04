package com.faustino.rainbow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button buttonRed;
    Button buttonBlue;
    Button buttonGreen;
    Button buttonOrange;
    Button buttonCyan;
    Button buttonMagenta;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonRed = findViewById(R.id.button_red);
        buttonBlue = findViewById(R.id.button_blue);
        buttonGreen = findViewById(R.id.button_green);
        buttonOrange = findViewById(R.id.button_orange);
        buttonCyan = findViewById(R.id.button_cyan);
        buttonMagenta = findViewById(R.id.button_magenta);
        layout = findViewById(R.id.layout);

        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            }
        });
        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
            }
        });
        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            }
        });
        buttonOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_dark));
            }
        });
        buttonCyan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_light));
            }
        });
        buttonMagenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
            }
        });
    }
}
