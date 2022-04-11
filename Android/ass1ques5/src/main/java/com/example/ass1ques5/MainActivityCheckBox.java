package com.example.ass1ques5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivityCheckBox extends AppCompatActivity {
CheckBox c1,c2,c3;
Button b1;
TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_check_box);
        addListnerOnButtonClick();
    }

    private void addListnerOnButtonClick() {
        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);
        b1=findViewById(R.id.b1);
        t1=findViewById(R.id.t1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int totalamount =0;
                StringBuilder result = new StringBuilder();
                result.append("Selected Books :");
                if(c1.isChecked()){
                    result.append("\nc1 500Rs");
                    totalamount += 500;
                }
                if(c2.isChecked()){
                    result.append("\nc2 300Rs");
                    totalamount += 300;
                }
                if(c3.isChecked()){
                    result.append("\nc3 200Rs");
                    totalamount += 200;
                }
                result.append("\nTotal :" +totalamount +"Rs");
                t1.setText(result.toString());
            }
        });
    }
}