package com.campusconnect;

//child class 

public class Faculty extends Person{
	 private String department;

	    public Faculty(int id, String name, String email, String department) {
	        super(name, email, id);
	        this.department = department;
	    }

	    @Override
	    public void printDetails() {
	        super.printDetails();
	        System.out.println("Department: " + department);
	    }
}
