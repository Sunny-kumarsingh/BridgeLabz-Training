package com.EduMentor;
class Instructor extends User {
    public Instructor(String name, String email, int userId) {
        super(name, email, userId);
    }

    // Create course
    public void createCourse() {
        System.out.println("Course created by " + name);
    }
}