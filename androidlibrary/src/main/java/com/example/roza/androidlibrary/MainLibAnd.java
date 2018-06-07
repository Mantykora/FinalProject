package com.example.roza.androidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by hiddenpik on 06.06.2018.
 */

public class MainLibAnd extends AppCompatActivity {
    TextView jokeTv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lib_and_main);
        jokeTv = findViewById(R.id.jokeTextView);

        Intent intent = getIntent();
        String jokeString = intent.getStringExtra("joke");

        jokeTv.setText(jokeString);


    }
}
