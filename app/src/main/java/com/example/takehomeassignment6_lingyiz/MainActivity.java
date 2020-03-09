package com.example.takehomeassignment6_lingyiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2, e3;
    float f1, f2, f3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void phase(View view) {

        getValue();

        Intent m = new Intent(this, DisplayWindow.class);

        m.putExtra("Calculator", constructCalculator());
        startActivity(m);


    }

    private void getValue() {
        e1 = (EditText)findViewById(R.id.e1);
        f1 = Float.parseFloat(e1.getText().toString());
        e2 = (EditText)findViewById(R.id.e2);
        f2 = Float.parseFloat(e2.getText().toString());
        e3 = (EditText)findViewById(R.id.e3);
        f3 = Float.parseFloat(e3.getText().toString());
    }

    private Calculator constructCalculator(){
        Calculator calculator = new Calculator(f1, f2, f3);
        return calculator;
    }
}
