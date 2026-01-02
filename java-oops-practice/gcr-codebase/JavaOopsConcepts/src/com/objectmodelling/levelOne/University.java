package com.objectmodelling.levelOne;


	
	import java.util.ArrayList;

	class University {
	    String universityName;
	    ArrayList<Department> departments;  
	    ArrayList<Faculty> faculties;         

	    University(String universityName) {
	        this.universityName = universityName;
	        departments = new ArrayList<>();
	        faculties = new ArrayList<>();
	    }

	    void addDepartment(String deptName) {
	        departments.add(new Department(deptName)); 
	    }

	    void addFaculty(Faculty faculty) {
	        faculties.add(faculty);
	    }

	    void displayDetails() {
	        System.out.println("\nUniversity: " + universityName);

	        System.out.println("Departments:");
	        for (Department d : departments) {
	            d.display();
	        }

	        System.out.println("Faculty Members:");
	        for (Faculty f:faculties) {
	            f.display();
	        }
	    }
	}



