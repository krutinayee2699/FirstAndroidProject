package com.example.activitylifecycledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Second extends AppCompatActivity {

    public static  final String Tag=MainActivity.class.getCanonicalName();
    @Override
    protected  void onStart()
    {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart called", Toast.LENGTH_SHORT).show();
        Log.i(Tag,"onStart called.....");
    }
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume called", Toast.LENGTH_SHORT).show();
        Log.i(Tag,"onResume called.....");
    }

    protected  void onPause()
    {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause called", Toast.LENGTH_SHORT).show();
        Log.i(Tag,"onPause called.....");
    }

    protected  void onRestart()
    {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "onRestart called", Toast.LENGTH_SHORT).show();
        Log.i(Tag,"onRestart called.....");
    }

    protected  void onStop()
    {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop called", Toast.LENGTH_SHORT).show();
        Log.i(Tag,"onStop called.....");
    }

    protected  void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy called", Toast.LENGTH_SHORT).show();
        Log.i(Tag,"onDestroy called.....");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


    }
}