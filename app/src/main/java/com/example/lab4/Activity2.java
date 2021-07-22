package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Activity2 extends AppCompatActivity {
    private ImageButton mgButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        mgButton = findViewById(R.id.imageButton3);
        mgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Clicked");
                Intent act3 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(act3);
            }
        });
    }
}