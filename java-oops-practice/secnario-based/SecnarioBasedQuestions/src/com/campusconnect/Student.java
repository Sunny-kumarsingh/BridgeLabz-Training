package com.campusconnect;

//child class 

public class Student extends Person implements ICourseActions{
	private int[] grades;
	
	Student(String name, String email, int id, int[] grades){
		super(name, email, id);
		this.grades = grades;
	}
	
	//calculate GPA
	public double calculateGPA() {
		int sum =0;
		for(int n: grades) {
			sum += n;
		}
		return (double)sum/grades.length;
	}
	
	public void printDetails() {
        super.printDetails();
        System.out.println("GPA: " + calculateGPA());
    }
	
	 public void enrollCourse(Course course) {
	        course.addStudent(this);
	    }
	
	 public void dropCourse(Course course) {
	        course.removeStudent(this);
	    }
}
