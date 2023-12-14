package com.example.multipurposecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner s1;
    String []select_array={"Calculator","Currency","Simple Interest","Compound Interest","BMI Calculator"};
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1=(Spinner) findViewById(R.id.spinner);
        b1=(Button) findViewById(R.id.button);
        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_item,select_array);
        s1.setAdapter(adapter);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1=s1.getSelectedItem().toString();
                if(n1.equals("Calculator"))
                {
                    Intent i1 = new Intent(MainActivity.this, Calculator.class);
                    startActivity(i1);
                }
                if(n1.equals("Currency"))
                {
                    Intent i2=new Intent(MainActivity.this,Currency.class);
                    startActivity(i2);
                }
                if(n1.equals("BMI Calculator"))
                {
                   Intent i3=new Intent(MainActivity.this,BMI.class);
                   startActivity(i3);
                }
                if(n1.equals("Simple Interest"))
                {
                    Intent i4=new Intent(MainActivity.this,SimpleInterest.class);
                    startActivity(i4);
                }
                if(n1.equals("Compound Interest"))
                {
                    Intent i5=new Intent(MainActivity.this,CompoundInterest.class);
                    startActivity(i5);
                }

            }
        });
    }
}