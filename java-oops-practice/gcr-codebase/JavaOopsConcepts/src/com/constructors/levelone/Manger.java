package com.constructors.levelone;

class Manager extends Employee {

    String managerLevel;

    Manager(int employeeID, String department, double salary, String managerLevel) {
        super(employeeID, department, salary);
        this.managerLevel = managerLevel;
    }

    void displayManagerDetails() {
        // Accessing public variable
        System.out.println("Employee ID : " + employeeID);

        // Accessing protected variable
        System.out.println("Department  : " + department);

        // Accessing private variable via public method
        System.out.println("Salary      : ₹" + getSalary());

        System.out.println("Level       : " + managerLevel);
    }

    
}
