package com.example.assigques1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
Button b4,b2,b3;
RelativeLayout r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1=findViewById(R.id.r1);
        b4=findViewById(R.id.b4);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r1.setBackgroundResource(R.color.red);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r1.setBackgroundResource(R.color.green);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r1.setBackgroundResource(R.color.blue);
            }
        });
    }
}