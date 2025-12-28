package com.constructors.levelone;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("Laptop", 55000);
        p1.displayProductDetails();

        Product p2 = new Product("Mobile", 25000);
        p2.displayProductDetails();

        Product p3 = new Product("Headphones", 3000);
        p3.displayProductDetails();

        // Calling static method
        Product.displayTotalProducts();

	}

}
