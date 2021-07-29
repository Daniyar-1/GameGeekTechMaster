package com.example.gamegeektech;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class GameScreen1 extends AppCompatActivity {

    EditText etInput;
    ImageView btnDelete;
    Button btnCheckWord;
    TextView letter1, letter2, letter3, letter4, letter5, letter6, letter7, letter8, letter9, letter10, letter11, letter12;
    final String correctWord = "ФРАНЦИЯ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen1);

        btnDelete = findViewById(R.id.btn_delete);
        etInput = findViewById(R.id.et_input);
        btnCheckWord = findViewById(R.id.btn_check_word);

        letter1 = findViewById(R.id.letter1);
        letter2 = findViewById(R.id.letter2);
        letter3 = findViewById(R.id.letter3);
        letter4 = findViewById(R.id.letter4);
        letter5 = findViewById(R.id.letter5);
        letter6 = findViewById(R.id.letter6);
        letter7 = findViewById(R.id.letter7);
        letter8 = findViewById(R.id.letter8);
        letter9 = findViewById(R.id.letter9);
        letter10 = findViewById(R.id.letter10);
        letter11 = findViewById(R.id.letter11);
        letter12 = findViewById(R.id.letter12);

        btnCheckWord.setOnClickListener(v -> {
            if (etInput.getText().toString().equals(correctWord)) {

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Вы угадали слово!");
                builder.setMessage("Молодец, пойдём дальше?");



            } else if (etInput.getText().toString().isEmpty()) {
                etInput.setError("Введите слово");
            } else {
                Toast.makeText(this, "Неправильное слово!!!", Toast.LENGTH_SHORT).show();
            }
        });

        btnDelete.setOnClickListener(v -> {
            String text = etInput.getText().toString();
            etInput.setText(text.substring(0, text.length() - 1));
        });

        letter1.setOnClickListener(v -> {
            etInput.append(letter1.getText().toString());
        });

        letter2.setOnClickListener(v -> {
            etInput.append(letter2.getText().toString());
        });

        letter3.setOnClickListener(v -> {
            etInput.append(letter3.getText().toString());
        });

        letter4.setOnClickListener(v -> {
            etInput.append(letter4.getText().toString());
        });

        letter5.setOnClickListener(v -> {
            etInput.append(letter5.getText().toString());
        });

        letter6.setOnClickListener(v -> {
            etInput.append(letter6.getText().toString());
        });
        letter7.setOnClickListener(v -> {
            etInput.append(letter7.getText().toString());

        });
        letter8.setOnClickListener(v -> {
            etInput.append(letter8.getText().toString());
        });
        letter9.setOnClickListener(v -> {
            etInput.append(letter9.getText().toString());
        });

        letter10.setOnClickListener(v -> {
            etInput.append(letter10.getText().toString());
        });
        letter11.setOnClickListener(v -> {
            etInput.append(letter11.getText().toString());
        });
        letter12.setOnClickListener(v -> {
            etInput.append(letter12.getText().toString());
        });

    }
}
