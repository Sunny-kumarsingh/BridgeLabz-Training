package com.inheritance.hierarchicalinheritance.bankaccounttypes;

public class BankMain {

	public static void main(String[] args) {
		
		BankAccount a1 = new SavingsAccount(101, 50000, 4.5);
        BankAccount a2 = new CheckingAccount(102, 30000, 10000);
        BankAccount a3 = new FixedDepositAccount(103, 200000, 5);

        a1.displayDetails();
        ((SavingsAccount) a1).displayAccountType();
        System.out.println("------------------");

        a2.displayDetails();
        ((CheckingAccount) a2).displayAccountType();
        System.out.println("------------------");

        a3.displayDetails();
        ((FixedDepositAccount) a3).displayAccountType();
	}

}
