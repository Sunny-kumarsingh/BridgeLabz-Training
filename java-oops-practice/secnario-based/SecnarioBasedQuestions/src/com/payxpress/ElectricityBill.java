package com.payxpress;
import java.time.LocalDate;

public class ElectricityBill extends Bill{
	
	ElectricityBill(double amount, LocalDate dueDate){
		super("Electricity", amount, dueDate);
	}

	public void pay() {
		if(!isPaid()) {
			markAsPaid();
			System.out.println("Electricity bill paid successfully. ");
		}
	}
	
	  public void sendReminder() {
	        System.out.println("Reminder: Please pay your Electricity bill.");
	    }
}
