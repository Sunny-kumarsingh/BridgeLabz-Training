package com.payxpress;
import java.time.LocalDate;


public class Bill implements IPayable {
	
	private String type;
	private double amount;
	private  LocalDate dueDate;
	private  boolean isPaid;
	
	Bill(String type, double amount, LocalDate dueDate){
		this.type = type;
		this.amount = amount;
		this.dueDate = dueDate;
		this.isPaid = false;
	}
	
	protected void markAsPaid() {
		this.isPaid = true;
	}
	
	protected boolean isOverdue() {
        return LocalDate.now().isAfter(dueDate);
    }
	
	protected double lateFee(double penalty) {
		return amount + penalty;
	}
	
	protected double getAmount() {
        return amount;
    }

    protected boolean isPaid() {
        return isPaid;
    }

    protected String getType() {
        return type;
    }
    
    

}
