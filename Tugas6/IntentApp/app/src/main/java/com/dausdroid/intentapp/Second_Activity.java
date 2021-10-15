package com.dausdroid.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Second_Activity extends AppCompatActivity {

    //Explicit second activity declaration
    TextView tvHello;

    private String Name;

    private String Key_Name = "NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //code second activity
        tvHello = (TextView) findViewById(R.id.tvHello);

        Bundle extras = getIntent().getExtras();
        Name = extras.getString(Key_Name);
        tvHello.setText("Halo, " + Name + " ! Selamat datang!!");
    }
}