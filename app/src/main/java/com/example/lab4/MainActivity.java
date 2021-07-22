package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mButton;
    private View mview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Clicked");
                Intent act2 = new Intent(getApplicationContext(), Activity2.class);
                startActivity(act2);

            }
        });

        mview = findViewById(R.id.view);
        mview.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                System.out.println("Touched");
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        mButton.setBackgroundColor(Color.RED);
                        break;
                }
                return false;
            }
        });
    }
}