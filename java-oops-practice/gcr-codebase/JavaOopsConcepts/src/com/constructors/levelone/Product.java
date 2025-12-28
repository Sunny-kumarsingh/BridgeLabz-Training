package com.constructors.levelone;

public class Product {
	String productName;
    double price;
    
    static int totalProducts = 0;
    
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  
    }
    // Instance method
    void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : ₹" + price);
        System.out.println("-----------------------");
    }

    // Class method (static method)
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}
