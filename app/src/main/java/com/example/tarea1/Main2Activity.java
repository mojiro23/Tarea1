package com.example.tarea1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    Intent result = getIntent();
    String strResult = result.getStringExtra("result");
        TextView textview = (TextView) findViewById(R.id.txtresultado);
        textview.setText(strResult);
    }

    }
