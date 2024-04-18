package com.example.ass3java;

public class CurrencyConverter {

    private static final double INR_TO_CAD_RATE = 0.01671682; //1CAD = 60 INR

    public static double convertINRToCAD(double amountInINR) {
        return amountInINR * INR_TO_CAD_RATE;
    }
}

