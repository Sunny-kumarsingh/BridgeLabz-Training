package com.objectmodelling.levelOne;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private int customerId;
    private String name;
    private List<Order> orders;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Communication method
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order ID: " + order.getOrderId());
    }

    public void showOrders() {
        System.out.println("Orders placed by " + name + ":");
        for (Order o : orders) {
            System.out.println("- Order ID: " + o.getOrderId());
        }
    }
}
