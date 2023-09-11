package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class MainActivity extends AppCompatActivity {

private Button cToF, fToC, cToK,fToK;
private TextView result;
private EditText enterTemp;
double result0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cToF=findViewById(R.id.cToF);
        fToC=findViewById(R.id.fToC);
        cToK=findViewById(R.id.cToK);
        fToK=findViewById(R.id.fToK);
        result=findViewById(R.id.result);
        enterTemp= findViewById(R.id.enterTemp);

        cToF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double temp=Double.parseDouble(enterTemp.getText().toString());
                result0=(temp*1.8)+32;
                result.setText(String.valueOf(result0));
            }
        });
        fToC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double temp=Double.parseDouble(enterTemp.getText().toString());
                result0=(temp-32)/1.8;
                result.setText(String.valueOf(result0));

            }
        });
        cToK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double temp=Double.parseDouble(enterTemp.getText().toString());
                result0=(temp)+273.15;
                result.setText(String.valueOf(result0));

            }
        });
        fToK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double temp=Double.parseDouble(enterTemp.getText().toString());
                result0=(temp+459.67)/1.8;
                result.setText(String.valueOf(result0));

            }
        });
    }
}