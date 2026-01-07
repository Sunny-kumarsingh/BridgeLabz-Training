package com.loanbuddy;

public class LoanApplication implements IApprovable {
	
	protected Applicant applicant;
	protected String loanType;
	protected int term;
	protected double interestRate;
	private boolean loanApproved;
	
	LoanApplication(Applicant applicant, String loanType, int term, double interestRate) {
		this.applicant = applicant;
		this.loanType = loanType;
		this.term = term;
		this.interestRate = interestRate;
	}
	
	 public String getLoanType() {
	        return loanType;
	 }
	 
	 protected void setLoanApproved(boolean status) {
	        this.loanApproved = status;
	 }
	 
	 public boolean isLoanApproved() {
	        return loanApproved;
	    }
	 
	 protected double baseEMI(double multiplier) {
	        double P = applicant.getloanAmount();
	        double R = (interestRate / 12) / 100 * multiplier;
	        int N = term;

	        return (P * R * Math.pow(1 + R, N)) /
	               (Math.pow(1 + R, N) - 1);
	 }
	 
	 
	 @Override
	 public boolean approveLoan() {
	        return false;
	 }
	 
	 public double calculateEmi() {
	        return 0.0;
	    } 
	 
}
