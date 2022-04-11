package com.example.dp_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button btn;
    DatePicker dp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv.findViewById(R.id.t1);
        tv.findViewById(R.id.c1);
        tv.findViewById(R.id.b1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(dp.getDayOfMonth()+"/" + dp.getMonth()+1+ "/" + dp.getYear() );
            }
        });

    }
}