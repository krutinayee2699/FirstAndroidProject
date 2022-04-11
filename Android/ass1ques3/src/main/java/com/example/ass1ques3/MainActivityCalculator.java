package com.example.ass1ques3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityCalculator extends AppCompatActivity {
EditText e1,e2;
Button b1,b2,b3,b4;
TextView t1;
Integer answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calculator);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        t1=findViewById(R.id.t1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer=Integer.parseInt(e1.getText().toString())+Integer.parseInt(e2.getText().toString());
                Toast.makeText(getApplicationContext(),"ans"+answer,Toast.LENGTH_SHORT).show();
                t1.setText(answer+"");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer=Integer.parseInt(e1.getText().toString())-Integer.parseInt(e2.getText().toString());
                Toast.makeText(getApplicationContext(),"ans"+answer,Toast.LENGTH_SHORT).show();
                t1.setText(answer+"");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer=Integer.parseInt(e1.getText().toString())*Integer.parseInt(e2.getText().toString());
                Toast.makeText(getApplicationContext(),"ans"+answer,Toast.LENGTH_SHORT).show();
                t1.setText(answer+"");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer=Integer.parseInt(e1.getText().toString())/Integer.parseInt(e2.getText().toString());
                Toast.makeText(getApplicationContext(),"ans"+answer,Toast.LENGTH_SHORT).show();
                t1.setText(answer+"");
            }
        });
    }
}