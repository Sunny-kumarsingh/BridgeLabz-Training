package com.functionalinterface.defaultmethods.paymentgateway;
public class PaymentApp {

    public static void main(String[] args) {

        PaymentProcessor p1 = new UPIProcessor();
        PaymentProcessor p2 = new CreditCardProcessor();
        PaymentProcessor p3 = new WalletProcessor();

        p1.refund(200);   // default method
        p2.refund(300);   // default method
        p3.refund(400);   // overridden method
    }
}
