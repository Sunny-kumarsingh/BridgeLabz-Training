package com.skillforge;
import java.util.*;

class Course implements ICertifiable {

    private String title;
    private Instructor instructor;
    private double rating; 
    private String[] modules;
    private final List<String> reviews;
    private String level;

    // Default constructor
    public Course(String title, Instructor instructor, String level) {
        this.title = title;
        this.instructor = instructor;
        this.level = level;
        this.modules = new String[]{"Introduction", "Basics", "Final Project"};
        this.reviews = new ArrayList<>();
    }

    // Custom modules constructor
    public Course(String title, Instructor instructor, String level, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.level = level;
        this.modules = modules;
        this.reviews = new ArrayList<>();
    }

    // Encapsulated rating logic
    protected void updateRating(double newRating) {
        if (newRating >= 0 && newRating <= 5) {
            this.rating = newRating;
        }
    }

    public double getRating() {
        return rating;
    }

    // Read-only reviews
    public List<String> getReviews() {
        return Collections.unmodifiableList(reviews);
    }

    public void addReview(String review) {
        reviews.add(review);
    }

    // Operators for progress tracking
    public double calculateProgress(Student student) {
        return (student.getCompletedModules() * 100.0) / modules.length;
    }

    // Operators for grading
    public void calculateGrade(Student student) {
        double progress = calculateProgress(student);

        if (progress == 100) student.setGrade(90);
        else if (progress >= 70) student.setGrade(75);
        else student.setGrade(50);
    }

    // Polymorphism: certificate format varies by level
    @Override
    public void generateCertificate(Student student) {
        System.out.println("\n");
        System.out.println("Student: " + student.name);
        System.out.println("Course: " + title);
        System.out.println("Instructor: " + instructor.name);

        if (level.equalsIgnoreCase("Advanced")) {
            System.out.println("Certification: ADVANCED PROFESSIONAL");
        } else {
            System.out.println("Certification: COURSE COMPLETION");
        }

        System.out.println("Grade: " + student.getGrade());

    }
}
