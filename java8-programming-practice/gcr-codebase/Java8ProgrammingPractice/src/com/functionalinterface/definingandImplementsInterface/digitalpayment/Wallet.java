package com.functionalinterface.definingandImplementsInterface.digitalpayment;
public class Wallet implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Wallet");
    }
}
