package com.loanbuddy;

public class HomeLoan extends LoanApplication {
	
	public HomeLoan(Applicant applicant, int term) {
		super(applicant,"HOME", term, 8.5);
	}
	
	public boolean approveLoan() {
        if (applicant.getCreditScore() >= 700) {
            setLoanApproved(true);
            return true;
        }
        return false;
    }
	
	public double calculateEMI() {
        return baseEMI(1.0);
    }
	
}
