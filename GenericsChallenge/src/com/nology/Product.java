package com.nology;

public abstract class Product {
    protected double price;

    public double calculateTax() {
        double total;
        total = price + ((price / 100) * 10);
        return total;
    }

    public double calcRTXTax() {
        double total;
        total = price + ((price / 100) * 100);
        return total;
    }
}
