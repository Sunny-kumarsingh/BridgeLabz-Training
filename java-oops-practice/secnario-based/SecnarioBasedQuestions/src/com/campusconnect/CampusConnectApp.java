package com.campusconnect;
public class CampusConnectApp {

    public static void main(String[] args) {

        Faculty f1 = new Faculty(101, "Dr. Sharma", "sharma@college.edu", "Computer Science");

        int[] grades1 = {85, 90, 88};
        Student s1 = new Student("Rahul", "rahul@college.edu", 1, grades1);

        Course javaCourse = new Course("Java Programming", f1);

        // Interface + polymorphism
        s1.enrollCourse(javaCourse);
        javaCourse.showCourseDetails();

        // Polymorphism in action
        Person p1 = s1;
        Person p2 = f1;

        System.out.println("\n--- Person Details ---");
        p1.printDetails();
        System.out.println();
        p2.printDetails();
    }
}
