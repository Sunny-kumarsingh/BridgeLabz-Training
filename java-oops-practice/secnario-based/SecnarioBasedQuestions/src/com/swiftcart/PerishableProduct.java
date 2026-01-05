package com.swiftcart;
public class PerishableProduct extends Product {

    public PerishableProduct(String name, double price) {
        super(name, price, "Perishable");
    }

    @Override
    public double applyDiscount(double total) {
        return total - (total * 0.10);
    }
}
