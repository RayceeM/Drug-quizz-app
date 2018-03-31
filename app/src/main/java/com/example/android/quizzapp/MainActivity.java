package com.example.android.quizzapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View v) {
        Intent i = new Intent(MainActivity.this, start_quiz.class);
        startActivity(i);
    }
    public void About(View v) {
        Intent i = new Intent(MainActivity.this, about.class);
        startActivity(i);
    }}
