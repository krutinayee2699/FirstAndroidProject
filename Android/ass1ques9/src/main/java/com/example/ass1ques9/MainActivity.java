package com.example.ass1ques9;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button re ,or,yl,gr,bl,in,vi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        re=findViewById(R.id.re);
        re.setBackgroundColor(Color.RED);

        or=findViewById(R.id.or);
        or.setBackgroundColor(Color.rgb(255,165,0));


        yl=findViewById(R.id.yl);
        yl.setBackgroundColor(Color.YELLOW);

        gr=findViewById(R.id.gr);
        gr.setBackgroundColor(Color.GREEN);

        bl=findViewById(R.id.bl);
        bl.setBackgroundColor(Color.BLUE);

        in=findViewById(R.id.in);
        in.setBackgroundColor(Color.rgb(75,0,175));

        vi=findViewById(R.id.vi);
        vi.setBackgroundColor(Color.MAGENTA);
    }
}