package com.constructors.levelone;

class SavingsAccount extends BankAccount {

    double interestRate;

    SavingsAccount(int accountNumber, String accountHolder,
                   double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    void displaySavingsAccount() {
        // Accessing public variable
        System.out.println("Account Number : " + accountNumber);

        // Accessing protected variable
        System.out.println("Account Holder : " + accountHolder);

        // Accessing private variable via public method
        System.out.println("Balance        : ₹" + getBalance());

        System.out.println("Interest Rate  : " + interestRate + "%");
    }

}
