package com.artify;

public class User {
	protected String name;
	protected double walletBalance;
	
	User(String name, double walletBalance ){
		this.name = name;
		this.walletBalance = walletBalance;
	}
	
	public double getWalletBalance() {
		return walletBalance;
	}
	
	public void deductAmount(double amount) {
		if(amount>walletBalance) {
			System.out.println("Invalid amount !");
		}
		else {
			walletBalance -= amount; 
		}
		
	}
}
