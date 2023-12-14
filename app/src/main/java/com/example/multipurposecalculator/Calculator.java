package com.example.multipurposecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends AppCompatActivity {
    EditText e1,e2,e3;
    Button sum,sub,mul,div,sqrt;
    Button pow1,sin1,cos1,tan1;

    Float num1,num2,res;
    Double res2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        e1=(EditText) findViewById(R.id.editTextNumber);
        e2=(EditText) findViewById(R.id.editTextNumber2);
        e3=(EditText) findViewById(R.id.editTextTextPersonName4);
        sum=(Button) findViewById(R.id.sum);
        sub=(Button) findViewById(R.id.sub);
        mul=(Button) findViewById(R.id.mul);
        div=(Button) findViewById(R.id.div);
        sqrt=(Button) findViewById(R.id.sqrt);
        pow1=(Button) findViewById(R.id.pow);
        sin1=(Button) findViewById(R.id.sin);
        cos1=(Button) findViewById(R.id.cos);
        tan1=(Button) findViewById(R.id.tan);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               num1=Float.parseFloat(e1.getText().toString());
               num2=Float.parseFloat(e2.getText().toString());
               res =  num1 + num2;
               e3.setText(res.toString());
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Float.parseFloat(e1.getText().toString());
                num2=Float.parseFloat(e2.getText().toString());
                res = num1 - num2;
                e3.setText(res.toString());
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Float.parseFloat(e1.getText().toString());
                num2=Float.parseFloat(e2.getText().toString());
                res = num1 * num2;
                e3.setText(res.toString());
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Float.parseFloat(e1.getText().toString());
                num2=Float.parseFloat(e2.getText().toString());
                res = num1 / num2;
                e3.setText(res.toString());
            }
        });
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Float.parseFloat(e1.getText().toString());
                res2=Math.sqrt(num1);
                e3.setText(res2.toString());
            }
        });
        pow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Float.parseFloat(e1.getText().toString());
                num2=Float.parseFloat(e2.getText().toString());
                res2=Math.pow(num1,num2);
                e3.setText(res2.toString());
            }
        });
        sin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Float.parseFloat(e1.getText().toString());
                res2=Math.sin(num1);
                e3.setText(res2.toString());
            }
        });
        cos1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Float.parseFloat(e1.getText().toString());
                res2=Math.cos(num1);
                e3.setText(res2.toString());
            }
        });
        tan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Float.parseFloat(e1.getText().toString());
                res2=Math.tan(num1);
                e3.setText(res2.toString());
            }
        });
    }
}