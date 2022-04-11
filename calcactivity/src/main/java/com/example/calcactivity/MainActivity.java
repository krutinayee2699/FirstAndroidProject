package com.example.calcactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4;
    EditText no1,no2;
    TextView tv;
    int answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        no1 = findViewById(R.id.no1);
        no2 = findViewById(R.id.no2);
        tv = findViewById(R.id.tv);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer = Integer.parseInt(no1.getText().toString()) + Integer.parseInt(no2.getText().toString());
                Toast.makeText(getApplicationContext(), "Ans = " +answer, Toast.LENGTH_SHORT).show();
                tv.setText(" " + answer +" ");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer = Integer.parseInt(no1.getText().toString()) - Integer.parseInt(no2.getText().toString());
                Toast.makeText(getApplicationContext(), "Ans = " +answer, Toast.LENGTH_SHORT).show();
                tv.setText(" " + answer +" ");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer = Integer.parseInt(no1.getText().toString()) * Integer.parseInt(no2.getText().toString());
                Toast.makeText(getApplicationContext(), "Ans = " +answer, Toast.LENGTH_SHORT).show();
                tv.setText(" " + answer +" ");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer = Integer.parseInt(no1.getText().toString()) / Integer.parseInt(no2.getText().toString());
                Toast.makeText(getApplicationContext(), "Ans = " +answer, Toast.LENGTH_SHORT).show();
                tv.setText(" " + answer +" ");
            }
        });
    }
}