package com.classandobject.levelone;
import java.util.*;

class Employee {
	//non-static variables
	String name;
	int id;
	double salary;
	
	//Constructor
	Employee(String name, int id,double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	//creating method to display employee details
	public  void displayEmployee() {
		System.out.println("Employee Name: "+name);
		System.out.println("Employee id: "+id);
		System.out.println("Employee Salary: "+salary);
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		// Taking input from user
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        // calling constructor
        Employee emp = new Employee(name, id, salary);

        // calling display method
        emp.displayEmployee();
	}

}
