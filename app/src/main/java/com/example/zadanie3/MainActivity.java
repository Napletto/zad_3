package com.example.zadanie3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    Button btnGreet;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        btnGreet = findViewById(R.id.btnGreet);
        tvResult = findViewById(R.id.tvResult);

        btnGreet.setOnClickListener(v -> greet());
    }

    void greet() {

        String name = etName.getText().toString().trim();

        tvResult.setText("Cześć, " + name + "!");
    }
}