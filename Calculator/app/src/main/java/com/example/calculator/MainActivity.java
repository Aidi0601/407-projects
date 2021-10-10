package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void clickFunctionSum(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.editTextNumber1);
        int number1 = Integer.parseInt(myTextField1.getText().toString());
        EditText myTextField2 = (EditText) findViewById(R.id.editTextNumber1);
        int number2 = Integer.parseInt(myTextField2.getText().toString());
        int result = number1 + number2;
        String res = String.valueOf(result);
        goToActivity2(res);
    }
    public void goToActivity2(String s){
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}