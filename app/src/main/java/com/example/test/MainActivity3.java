package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    public int newnum1;
    public int newnum2;
    public EditText solution;
    public EditText number1;
    public EditText number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }

    public void add(View view){
        number1 = (EditText) findViewById(R.id.num1);
        number2 = (EditText) findViewById(R.id.num2);
        solution = (EditText) findViewById(R.id.result);

        newnum1 = Integer.parseInt(number1.getText().toString());
        newnum2 = Integer.parseInt(number2.getText().toString());

        int result = newnum1 + newnum2;

        solution.setText("Result " +result);

    }

    public void sub(View view){
        number1 = (EditText) findViewById(R.id.num1);
        number2 = (EditText) findViewById(R.id.num2);
        solution = (EditText) findViewById(R.id.result);

        newnum1 = Integer.parseInt(number1.getText().toString());
        newnum2 = Integer.parseInt(number2.getText().toString());

        int result = newnum1 - newnum2;

        solution.setText("Result " + result);

    }
    public void mul(View view){
        number1 = (EditText) findViewById(R.id.num1);
        number2 = (EditText) findViewById(R.id.num2);
        solution = (EditText) findViewById(R.id.result);

        newnum1 = Integer.parseInt(number1.getText().toString());
        newnum2 = Integer.parseInt(number2.getText().toString());

        int result = newnum1 * newnum2;

        solution.setText("Result " + result);

    }
    public void div(View view){
        number1 = (EditText) findViewById(R.id.num1);
        number2 = (EditText) findViewById(R.id.num2);
        solution = (EditText) findViewById(R.id.result);

        newnum1 = Integer.parseInt(number1.getText().toString());
        newnum2 = Integer.parseInt(number2.getText().toString());

        int result = newnum1 / newnum2;

        solution.setText("Result " + result);

    }

}