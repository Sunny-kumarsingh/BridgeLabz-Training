package com.constructors.levelone;

public class CourseName {
	String courseName;
    int  duration;
    int fee;
    
    static String instituteName ="TIT college"; 
    
    CourseName(String courseName, int duration, int fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;  
    }
    // Instance method
    void displayCourseDetails() {
        System.out.println("Institute Name : " + instituteName);
        System.out.println("Course Name    : " + courseName);
        System.out.println("Duration       : " + duration + " months");
        System.out.println("Fee            : ₹" + fee);
        System.out.println("------------------------------");
    }

 // Class method to update institute name
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}
