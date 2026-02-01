package com.functionalinterface.defaultmethods.paymentgateway;
public interface PaymentProcessor {

    void pay(double amount);

    // new feature added later
    default void refund(double amount) {
        System.out.println("Refunded ₹" + amount + " (default processing)");
    }
}
