package com.example.ass1ques4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityRadioButton extends AppCompatActivity {

EditText e1;
TextView t1;
RadioButton r1,r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_radio_button);
        e1=findViewById(R.id.e1);
        t1=findViewById(R.id.t1);

//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Double convert =Double.parseDouble(e1.getText().toString());
//                t1.setText(String.valueOf(convert*100));
//
//            }
//        });
    }
    public void onRadioButtonClicked(View view){
        boolean checked =((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.r1:
            if(checked){
                Toast.makeText(MainActivityRadioButton.this,"Enter length value to convert",Toast.LENGTH_SHORT).show();
            String temp =e1.getText().toString();
            int value =Integer.parseInt(temp);
            t1.setText(value+"Miles = "+value*1609.33999+ "Meters");
            }
        }
    }
}