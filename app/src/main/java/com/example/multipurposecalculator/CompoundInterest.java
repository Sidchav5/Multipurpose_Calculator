package com.example.multipurposecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CompoundInterest extends AppCompatActivity {
    EditText princ,rate,time,num,amount;
    Button Calculate;
    Double p,r,t,n,a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compound_interest);
        princ=(EditText) findViewById(R.id.pricipal);
        rate=(EditText) findViewById(R.id.rate);
        time=(EditText) findViewById(R.id.time);
        num=(EditText) findViewById(R.id.n);
        amount=(EditText) findViewById(R.id.amount);
        Calculate=(Button) findViewById(R.id.button12);
        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p=Double.parseDouble(princ.getText().toString());
                r=Double.parseDouble(rate.getText().toString());
                t=Double.parseDouble(time.getText().toString());
                n=Double.parseDouble(num.getText().toString());
                a= p * Math.pow(1+(r/100*n),n*t);
                amount.setText(a.toString());

            }
        });
    }
}