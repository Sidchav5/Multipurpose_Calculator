package com.example.multipurposecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SimpleInterest extends AppCompatActivity {
    EditText princ,rate,time,amount;
    Button calculate;
    Double p,r,t,a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_interest);
        princ=(EditText) findViewById(R.id.Principal);
        rate=(EditText) findViewById(R.id.Rate);
        time=(EditText) findViewById(R.id.Time);
        amount=(EditText) findViewById(R.id.Amount);
        calculate=(Button) findViewById(R.id.button11);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SimpleInterest.this, "Simple Interest calculation Done Successfully", Toast.LENGTH_SHORT).show();
                p=Double.parseDouble(princ.getText().toString());
                r=Double.parseDouble(rate.getText().toString());
                t=Double.parseDouble(time.getText().toString());
                a = p +(p*r*t)/100;
                amount.setText(a.toString());
            }
        });
    }
}