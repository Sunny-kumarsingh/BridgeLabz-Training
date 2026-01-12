package com.callcenter;
import java.util.*;

class CallCenter {

    // Normal customers queue
    Queue<Customer> normalQueue = new LinkedList<>();

    // VIP customers queue
    Queue<Customer> vipQueue = new PriorityQueue<>(
            (a, b) -> Boolean.compare(b.isVIP, a.isVIP)
    );

    // Customer call count
    HashMap<String, Integer> callCount = new HashMap<>();

    // Add incoming call
    public void addCall(Customer customer) {

        // Add to appropriate queue
        if (customer.isVIP) {
            vipQueue.add(customer);
        } else {
            normalQueue.add(customer);
        }

        // Update call count
        callCount.put(
                customer.name,
                callCount.getOrDefault(customer.name, 0) + 1
        );
    }

    // Handle next call
    public void handleCall() {
        Customer customer;

        if (!vipQueue.isEmpty()) {
            customer = vipQueue.poll();
        } else if (!normalQueue.isEmpty()) {
            customer = normalQueue.poll();
        } else {
            System.out.println("No calls in queue");
            return;
        }

        System.out.println("Handling call from: " + customer.name);
    }
}
