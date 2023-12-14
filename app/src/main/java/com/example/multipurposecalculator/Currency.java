package com.example.multipurposecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Currency extends AppCompatActivity {
    EditText e1,e2;
    Float num1;
    Double res;
    Button yen,pound,dollor,yuan,ruble;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
        e1=(EditText) findViewById(R.id.editTextNumber3);
        e2=(EditText) findViewById(R.id.editTextTextPersonName5);
        yen=(Button) findViewById(R.id.yen);
        pound=(Button) findViewById(R.id.pound);
        yuan=(Button) findViewById(R.id.yuan);
        ruble=(Button) findViewById(R.id.ruble);
        dollor=(Button) findViewById(R.id.dollor);
        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Currency.this, "Rupees in Yen ", Toast.LENGTH_SHORT).show();
                 num1=Float.parseFloat(e1.getText().toString());
                 res =  num1*1.82;
                 e2.setText(res.toString());

            }
        });
        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Currency.this, "Rupess in pound", Toast.LENGTH_SHORT).show();
                num1=Float.parseFloat(e1.getText().toString());
                res = num1*104.87;
                e2.setText(res.toString());
            }
        });
        dollor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Currency.this, "Ruppes in Dollar", Toast.LENGTH_SHORT).show();
                num1=Float.parseFloat(e1.getText().toString());
                res = num1*83.2;
                e2.setText(res.toString());
            }
        });
        yuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Currency.this, "Ruppes in Yaun", Toast.LENGTH_SHORT).show();
                num1=Float.parseFloat(e1.getText().toString());
                res=num1*11.73;
                e2.setText(res.toString());
            }
        });
        ruble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Currency.this, "Rupees in Ruble", Toast.LENGTH_SHORT).show();
                num1 = Float.parseFloat(e1.getText().toString());
                res =  num1*0.92;
                e2.setText(res.toString());
            }
        });

    }
}