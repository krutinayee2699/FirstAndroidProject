package com.example.assig1ques8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecoundActivity extends AppCompatActivity {
TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound);

        t1= findViewById(R.id.t1);
        Intent i =getIntent();
        String str = i.getStringExtra("message_key");
        t1.setText(str);
    }
}