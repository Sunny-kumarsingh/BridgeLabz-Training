package com.payxpress;
import java.time.LocalDate;


public class PayXpressApp {

    public static void main(String[] args) {


    	IPayable bill1 = new ElectricityBill(1200, LocalDate.now());
    	IPayable bill2 = new InternetBill(800, LocalDate.now());
    	IPayable bill3 = new WaterBill(300, LocalDate.now());

        bill1.sendReminder();
        bill2.sendReminder();
        bill3.sendReminder();

        bill1.pay();
        bill2.pay();
    }
}
