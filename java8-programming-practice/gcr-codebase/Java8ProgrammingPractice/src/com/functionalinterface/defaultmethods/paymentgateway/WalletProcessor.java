package com.functionalinterface.defaultmethods.paymentgateway;
public class WalletProcessor implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Wallet");
    }

    // custom refund logic
    @Override
    public void refund(double amount) {
        System.out.println("Refunded ₹" + amount + " to Wallet");
    }
}
