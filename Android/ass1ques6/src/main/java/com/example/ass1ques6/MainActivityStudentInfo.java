package com.example.ass1ques6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityStudentInfo extends AppCompatActivity {
Button b1;
EditText e1,e2,e3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_student_info);

        b1=findViewById(R.id.b1);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        e3=findViewById(R.id.e3);
b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String str=e1.getText().toString()+e2.getText().toString()+e3.getText().toString();
        Intent it=new Intent(getApplicationContext(),SecondMainActivity.class);
        it.putExtra("message_key",str);
        startActivity(it);
    }
});

    }
}