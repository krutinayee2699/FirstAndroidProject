package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tv;
    EditText fname;
    EditText lname;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         tv = findViewById(R.id.displayText);
         fname = findViewById(R.id.fname);
         lname = findViewById(R.id.lname);
         btn = findViewById(R.id.Add);
         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 tv.setText("Welcome " + fname.getText().toString() + "" + lname.getText().toString());
             }
         });
    }
}