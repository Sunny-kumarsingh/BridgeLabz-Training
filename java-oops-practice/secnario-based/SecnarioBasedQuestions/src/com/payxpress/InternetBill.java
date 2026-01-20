package com.payxpress;

import java.time.LocalDate;

public class InternetBill extends Bill {
	
	InternetBill(double amount, LocalDate dueDate){
		super("wi-fi", amount, dueDate);
	}
	
	@Override
	public void pay() {
		 markAsPaid();
	        System.out.println("Internet bill paid successfully.");
	}
	public void sendReminder() {
        System.out.println("Reminder: Please pay your Electricity bill.");
    }

	
}
