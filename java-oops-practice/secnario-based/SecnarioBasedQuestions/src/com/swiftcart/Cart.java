package com.swiftcart;

import java.util.ArrayList;

public class Cart implements ICheckout {

    private ArrayList<Product> products;
    private double totalPrice;

    public Cart() {
        this.products = new ArrayList<>();
        this.totalPrice = 0;
    }

    public Cart(ArrayList<Product> products) {
        this.products = products;
        calculateTotal();
    }

    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.price;
        }
    }

    public void addProduct(Product product, int quantity) {
        for (int i = 0; i < quantity; i++) {
            products.add(product);
        }
        totalPrice += product.price * quantity;
    }

    @Override
    public void applyDiscount() {
        if (products.isEmpty()) return;
        Product p = products.get(0);
        totalPrice = p.applyDiscount(totalPrice);
    }

    @Override
    public void generateBill() {
        System.out.println("Total Amount: " + totalPrice);
    }
}
