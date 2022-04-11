package com.example.ass1wues8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class act2 extends AppCompatActivity {
TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);

        t1=findViewById(R.id.t1);
        Intent i =getIntent();
        String str =i.getStringExtra("message_key");
        t1.setText(str);
    }
}