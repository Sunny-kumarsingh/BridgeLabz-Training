package com.inheritance.hierarchicalinheritance.bankaccounttypes;

public class FixedDepositAccount extends BankAccount{
	int tenureYears;

    FixedDepositAccount(int accountNumber, double balance, int tenureYears) {
        super(accountNumber, balance);
        this.tenureYears = tenureYears;
    }

    void displayAccountType() {
        System.out.println("Account Type : Fixed Deposit Account");
        System.out.println("Tenure      : " + tenureYears + " years");
    }
}
