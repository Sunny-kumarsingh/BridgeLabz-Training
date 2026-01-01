package com.objectmodelling;

import java.util.ArrayList;
import java.util.List;

class Order {
    private int orderId;
    private List<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getProductName() + " added to Order " + orderId);
    }

    public void showProducts() {
        System.out.println("Products in Order " + orderId + ":");
        for (Product p : products) {
            System.out.println("- " + p.getProductName() + " (₹" + p.getPrice() + ")");
        }
    }
}
