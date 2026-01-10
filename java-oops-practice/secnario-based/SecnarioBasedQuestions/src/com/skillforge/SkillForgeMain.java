package com.skillforge;
public class SkillForgeMain {
    public static void main(String[] args) {

        Instructor instructor =
                new Instructor("Amit Sharma", "amit@skillforge.com");

        String[] modules = {"Java Basics", "OOP", "Collections", "Project"};

        Course course =
                new Course("Java Mastery", instructor, "Advanced", modules);

        Student student =
                new Student("Rahul", "rahul@gmail.com");

        student.completeModule();
        student.completeModule();
        student.completeModule();
        student.completeModule();

        course.calculateGrade(student);
        course.generateCertificate(student);
    }
}
