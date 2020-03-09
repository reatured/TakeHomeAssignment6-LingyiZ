package com.example.takehomeassignment6_lingyiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DisplayWindow extends AppCompatActivity {

    float amount, tip, tax, total;
    Calculator calculator;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_window);
        calculator = getCalculator();
        calculation();
        display = (TextView)findViewById(R.id.display);
        display.setText(generateSummary());
}

    private String generateSummary() {
        return "Total: " + amount +"\nTip: " + tip +"\nTax: " + String.format("%.2f",tax) +"\nTotal Amount: " + total;
    }

    private void calculation() {
        amount = calculator.getAmount();
        tip = calculator.getTip() * amount;
        tax = calculator.getTax() * amount;
        total = amount + tip + tax;

    }

    private Calculator getCalculator() {
        return (Calculator) getIntent().getSerializableExtra("Calculator");
    }
}
