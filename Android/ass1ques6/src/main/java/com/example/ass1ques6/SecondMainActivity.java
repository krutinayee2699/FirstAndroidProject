package com.example.ass1ques6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondMainActivity extends AppCompatActivity {
TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);

        t1= findViewById(R.id.t1);
        Intent i =getIntent();
        String str = i.getStringExtra("message_key");
        t1.setText(str);
    }
}