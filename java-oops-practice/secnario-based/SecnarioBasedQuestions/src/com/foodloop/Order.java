package com.foodloop;
import java.util.*;

public class Order implements IOrderable {
	
	private List<FoodItem> items;
    private double total;

    // Constructor for combo meals
    public Order(List<FoodItem> items) {
        this.items = items;
        calculateTotal();
    }
	
    private void calculateTotal() {
        total = 0;
        for (FoodItem item : items) {
            if (item.isAvailable()) {
                total += item.getPrice();
                item.reduceStock();
            }
        }
        total -= applyDiscount();
    }

    // Polymorphism
    protected double applyDiscount() {
        if (total > 1000) return total * 0.20;
        else if (total > 500) return total * 0.10;
        return 0;
    }

    @Override
    public void placeOrder() {
        System.out.println("Order placed successfully!");
        System.out.println("Total amount: ₹" + total);
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order cancelled.");
    }

    
}
