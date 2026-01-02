package com.inheritance.hierarchicalinheritance.schoolsystem;

public class SchoolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Teacher("Mr. Sharma", 40, "Mathematics");
        Person p2 = new Student("Rohan", 16, "10th Grade");
        Person p3 = new Staff("Anita", 35, "Administration");

        p1.displayDetails();
        ((Teacher) p1).displayRole();
        System.out.println("----------------");

        p2.displayDetails();
        ((Student) p2).displayRole();
        System.out.println("----------------");

        p3.displayDetails();
        ((Staff) p3).displayRole();
	}

}
