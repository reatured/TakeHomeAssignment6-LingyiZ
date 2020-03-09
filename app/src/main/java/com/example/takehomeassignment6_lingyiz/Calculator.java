package com.example.takehomeassignment6_lingyiz;

import java.io.Serializable;

public class Calculator implements Serializable {
    float amount;
    float tip;
    float tax;


    public Calculator(float amount, float tip, float tax) {
        this.amount = amount;
        this.tip = tip;
        this.tax = tax;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getTip() {
        return tip;
    }

    public void setTip(float tip) {
        this.tip = tip;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }
}
