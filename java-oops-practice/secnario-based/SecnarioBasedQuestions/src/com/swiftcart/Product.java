package com.swiftcart;

public class Product {
	protected String name;
	protected double  price;
	protected String category;
	
	Product(String name, double price, String category){
		this.name = name;
		this.price = price;
		this.category = category;
		
	}
	
	 public double applyDiscount(double total) {
	        return total;
	    }

}
