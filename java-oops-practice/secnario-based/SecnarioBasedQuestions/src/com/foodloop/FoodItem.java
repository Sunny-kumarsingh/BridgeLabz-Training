package com.foodloop;

public class FoodItem {
	protected String name;
	protected String category;
	protected double price;
	protected int availability;
	
	FoodItem(String name, String category, double price, int availability ){
		
		this.name = name;
		this.category = category;
		this.price = price;
		this.availability = availability;
		
	}
	
	 public boolean isAvailable() {
	        return availability > 0;
	    }

	    protected void reduceStock() {
	        if (availability > 0) availability--;
	    }

	    public double getPrice() {
	        return price;
	    }
	    
	    public String getName() {
	        return name;
	    }
	
}
