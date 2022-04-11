package com.example.autocomplete_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView actv;
    String[] fruits = {"Apple","Mango","Strawberry","Chikoo"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actv= findViewById(R.id.act1);
        ArrayAdapter<String> adb=new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,fruits);
        actv.setThreshold(3);
        actv.setTextColor(Color.RED);
        actv.setAdapter(adb);
    }
}