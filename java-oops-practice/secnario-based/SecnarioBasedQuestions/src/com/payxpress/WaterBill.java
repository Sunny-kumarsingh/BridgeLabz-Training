package com.payxpress;
import java.time.LocalDate;

class WaterBill extends Bill {

    public WaterBill(double amount, LocalDate dueDate) {
        super("Water", amount, dueDate);
    }

    @Override
    public void pay() {
        markAsPaid();
        System.out.println("Water bill paid successfully.");
    }

    @Override
    public void sendReminder() {
        System.out.println("Reminder: Water bill pending. Save water, pay on time!");
    }
}
