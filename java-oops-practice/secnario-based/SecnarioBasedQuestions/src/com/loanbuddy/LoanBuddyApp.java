package com.loanbuddy;
public class LoanBuddyApp {

    public static void main(String[] args) {

       
        Applicant applicant = new Applicant(
                "Sunny Kumar",
                720,
                45000,
                500000
        );

        
        LoanApplication loan = new HomeLoan(applicant, 240);
       
  
        if (loan.approveLoan()) {
            System.out.println("Loan Approved ? ");
            System.out.println("Loan Type   : " + loan.getLoanType());
            System.out.println("Loan Amount: ? " + applicant.getloanAmount());
            System.out.println("EMI        : ? " + loan.calculateEmi());
            System.out.println("Tenure     : " + loan.term + " months");
        } else {
            System.out.println("Loan Rejected ?");
        }
    }
}
