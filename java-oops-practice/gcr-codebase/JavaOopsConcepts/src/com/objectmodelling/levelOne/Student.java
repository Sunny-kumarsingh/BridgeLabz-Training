package com.objectmodelling.levelOne;


import java.util.ArrayList;
import java.util.List;

class Student {
    private int id;
    private String name;
    private List<Course> courses;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Association method
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // maintain bidirectional link
    }

    public void showCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}
