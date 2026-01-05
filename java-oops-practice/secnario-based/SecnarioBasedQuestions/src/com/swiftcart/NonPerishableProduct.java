package com.swiftcart;
public class NonPerishableProduct extends Product {

    public NonPerishableProduct(String name, double price) {
        super(name, price, "Non-Perishable");
    }

    @Override
    public double applyDiscount(double total) {
        return total - (total * 0.05);
    }
}
