package com.dausdroid.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //implicit declaration
    Button button;
    EditText editText;

    //explicit declaration
    EditText name;
    Button btnSend;

    private final String Key_Name = "NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //code intent implicit
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editTextImplicit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = editText.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        //code intent explicit
        name = findViewById(R.id.etName);
        btnSend = findViewById(R.id.btn_send);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String Name = name.getText().toString();
                    if (Name.equals("")){
                        Toast.makeText(getApplicationContext(), "MASUKKAN NAMA ANDA!!",Toast.LENGTH_SHORT).show();
                    } else {
                        Intent i = new Intent(MainActivity.this, Second_Activity.class);
                        i.putExtra(Key_Name, Name);
                        startActivity(i);
                    }
                } catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "ERROR, COBA LAGI!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}