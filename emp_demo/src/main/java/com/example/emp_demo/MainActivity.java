package com.example.emp_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    dbhelper obj = new dbhelper(this,null,null,1);
    EditText en,eds,ec,edoj;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //obj.addData();
        en=findViewById(R.id.en);
        eds=findViewById(R.id.eds);
        ec=findViewById(R.id.ec);
        edoj=findViewById(R.id.edoj);
        btn=findViewById(R.id.badd);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                obj.addData(en.getText().toString(),eds.getText().toString(),ec.getText().toString(),
                        edoj.getText().toString());
            }
        });
    }
}