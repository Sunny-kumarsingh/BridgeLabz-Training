package com.callcenter;
public class CallCenterMain {
    public static void main(String[] args) {

        CallCenter center = new CallCenter();

        center.addCall(new Customer("Amit", false));
        center.addCall(new Customer("Riya", true));
        center.addCall(new Customer("Amit", false));
        center.addCall(new Customer("Neha", true));

        center.handleCall();
        center.handleCall();
        center.handleCall();
        center.handleCall();
    }
}
