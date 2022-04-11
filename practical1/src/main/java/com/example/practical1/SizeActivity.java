package com.example.practical1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SizeActivity extends AppCompatActivity {

    TextView tv;
    Button b1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_size);

        b1=findViewById(R.id.b1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        tv=findViewById(R.id.tv);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("Nayee Kruti");
                tv.setTextSize(20);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("Nayee Pari");
                tv.setTextSize(30);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("Nayee Arati");
                tv.setTextSize(60);
            }
        });
    }
}