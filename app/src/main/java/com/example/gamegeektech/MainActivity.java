package com.example.gamegeektech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = findViewById(R.id.btn_play);


        btnPlay.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,GameScreen1.class);
            startActivity(intent);

        });
    }
}