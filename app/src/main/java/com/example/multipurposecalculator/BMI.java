package com.example.multipurposecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BMI extends AppCompatActivity {
    EditText e2,e3;
    TextView bmi;
    Button b1;
    Double height , weight , res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
       // e1=(EditText) findViewById(R.id.weight);
        e2=(EditText) findViewById(R.id.weight);
        e3=(EditText) findViewById(R.id.height);
        bmi=(TextView) findViewById(R.id.BMI);
        b1=(Button) findViewById(R.id.button10);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                height=Double.parseDouble(e3.getText().toString());
                weight=Double.parseDouble(e2.getText().toString());
                res = weight/(height*height);
                bmi.setText(res.toString());
                if(res<18.5)
                {
                    Toast.makeText(BMI.this, "Underweight", Toast.LENGTH_LONG).show();
                }
                else if (res >= 18.5 && res <= 24.9)
                {
                    Toast.makeText(BMI.this, "Overweight", Toast.LENGTH_LONG).show();
                }
                else if(res >= 30.0 && res <= 39.9)
                {
                    Toast.makeText(BMI.this, "Obese", Toast.LENGTH_LONG).show();
                }
                else if(res>=40)
                {
                    Toast.makeText(BMI.this, "Extremely Obese", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}