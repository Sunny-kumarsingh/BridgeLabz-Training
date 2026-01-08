package com.medistore;

import java.time.LocalDate;

public class Medicine {

    protected String name;
    protected double price;
    protected LocalDate expiryDate;
    private int quantity;

    // constructor with default quantity
    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 10);
    }

    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    protected boolean hasStock(int q) {
        return q <= quantity;
    }

    protected void reduceStock(int q) {
        quantity -= q;
    }

    // sensitive pricing logic
    private double applyDiscount(double total) {
        return total;
    }

    protected double calculateTotal(int q) {
        return applyDiscount(price * q);
    }
}
