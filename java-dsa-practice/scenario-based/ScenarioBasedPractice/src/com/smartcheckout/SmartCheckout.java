package com.smartcheckout;
import java.util.*;

public class SmartCheckout {

    private Queue<Customer> customerQueue;
    private Map<String, Item> inventory;

    public SmartCheckout() {
        customerQueue = new LinkedList<>();
        inventory = new HashMap<>();

        // Initialize items (price, stock)
        inventory.put("Milk", new Item(50, 10));
        inventory.put("Bread", new Item(30, 20));
        inventory.put("Rice", new Item(60, 15));
    }

    // Add customer to queue
    public void addCustomer(Customer customer) {
        customerQueue.offer(customer);
        System.out.println(" Customer added: " + customer.name);
    }

    // Process billing (remove customer)
    public void processBilling() {
        if (customerQueue.isEmpty()) {
            System.out.println(" No customers in queue.");
            return;
        }

        Customer customer = customerQueue.poll();
        double totalBill = 0;

        System.out.println("\n Billing for " + customer.name);

        for (String itemName : customer.items) {
            Item item = inventory.get(itemName);

            if (item != null && item.stock > 0) {
                totalBill += item.price;
                item.stock--;   // update stock
                System.out.println(itemName + " ₹" + item.price);
            } else {
                System.out.println(itemName + "  Out of stock");
            }
        }

        System.out.println(" Total Bill: ₹" + totalBill);
    }

    // Display remaining stock
    public void showStock() {
        System.out.println("\n Current Stock:");
        for (String key : inventory.keySet()) {
            Item item = inventory.get(key);
            System.out.println(key + " → " + item.stock + " units");
        }
    }
}
