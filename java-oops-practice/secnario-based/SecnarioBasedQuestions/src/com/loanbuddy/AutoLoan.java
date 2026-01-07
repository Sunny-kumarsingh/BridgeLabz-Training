package com.loanbuddy;
public class AutoLoan extends LoanApplication {

    public AutoLoan(Applicant applicant, int term) {
        super(applicant, "AUTO", term, 10.5);
    }

    @Override
    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 650) {
            setLoanApproved(true);
            return true;
        }
        return false;
    }

    @Override
    public double calculateEmi() {
        return baseEMI(1.1);
    }
}
