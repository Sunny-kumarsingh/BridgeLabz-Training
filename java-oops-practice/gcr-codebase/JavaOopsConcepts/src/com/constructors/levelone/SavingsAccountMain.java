package com.constructors.levelone;

public class SavingsAccountMain {
	public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(
                10101, "Raj Kumar", 5000, 4.5
        );

        sa.displaySavingsAccount();

        // Modifying balance using public methods
        sa.deposit(2000);
        sa.withdraw(1000);

        System.out.println("\nAfter Transactions:");
        sa.displaySavingsAccount();
    }
}
