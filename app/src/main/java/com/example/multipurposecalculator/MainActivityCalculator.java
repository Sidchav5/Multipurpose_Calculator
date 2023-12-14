package com.example.multipurposecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.zip.DeflaterOutputStream;

public class MainActivityCalculator extends AppCompatActivity {
    EditText e1 , e2 , e3;
    Float num1 , num2 , res;
    Double res2;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.editTextTextPersonName2);
        e2=(EditText) findViewById(R.id.editTextTextPersonName);
        e3=(EditText) findViewById(R.id.editTextTextPersonName3);
        b1=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        b5=(Button) findViewById(R.id.button5);
        b6=(Button) findViewById(R.id.button6);
        b7=(Button) findViewById(R.id.button7);
        b8=(Button) findViewById(R.id.button8);
        b9=(Button) findViewById(R.id.button9);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Float.parseFloat(e1.getText().toString());
                num2 =Float.parseFloat(e2.getText().toString());
                res=num1+num2;
                e3.setText(res.toString());
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Float.parseFloat(e1.getText().toString());
                num2 = Float.parseFloat(e2.getText().toString());
                res = num1 - num2 ;
                e3.setText(res.toString());

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Float.parseFloat(e1.getText().toString());
                num2 =Float.parseFloat(e2.getText().toString());
                res = num1 * num2 ;
                e3.setText(res.toString());
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Float.parseFloat(e1.getText().toString());
                num2 =Float.parseFloat(e2.getText().toString());
                res = num1 / num2;
                e3.setText(res.toString());
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Float.parseFloat(e1.getText().toString());
                res2 = Math.sqrt(num1);
                e3.setText(res2.toString());
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Float.parseFloat(e1.getText().toString());
                num2=Float.parseFloat(e2.getText().toString());
                res2 = Math.pow(num1,num2);
                e3.setText(res2.toString());
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Float.parseFloat(e1.getText().toString());
                res2=Math.sin(num1);
                e3.setText(res2.toString());
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Float.parseFloat(e1.getText().toString());
                res2=Math.cos(num1);
                e3.setText(res2.toString());
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Float.parseFloat(e1.getText().toString());
                res2=Math.tan(num1);
                e3.setText(res2.toString());
            }
        });
    }
}