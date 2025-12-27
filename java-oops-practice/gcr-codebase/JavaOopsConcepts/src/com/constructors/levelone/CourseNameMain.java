package com.constructors.levelone;

public class CourseNameMain {
	public static void main(String[] args) {

        CourseName c1 = new CourseName("Java Full Stack", 6, 45000);
        CourseName c2 = new CourseName("Python", 4, 30000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Update institute name for all courses
        CourseName.updateInstituteName("tit Technologies");

        System.out.println("\nAfter Updating Institute Name:\n");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
