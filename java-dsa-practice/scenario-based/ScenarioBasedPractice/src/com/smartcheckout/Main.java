package com.smartcheckout;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SmartCheckout checkout = new SmartCheckout();

        Customer c1 = new Customer("Amit",
                Arrays.asList("Milk", "Bread", "Rice"));

        Customer c2 = new Customer("Neha",
                Arrays.asList("Milk", "Milk", "Bread"));

        checkout.addCustomer(c1);
        checkout.addCustomer(c2);

        checkout.processBilling();
        checkout.processBilling();

        checkout.showStock();
    }
}
