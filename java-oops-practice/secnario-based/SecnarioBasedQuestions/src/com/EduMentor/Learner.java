package com.EduMentor;

class Learner extends User implements ICertifiable {
    private String courseType; // short-course / full-time
    private double percentage;

    // Learner constructor
    public Learner(String name, String email, int userId, String courseType) {
        super(name, email, userId);
        this.courseType = courseType;
    }

    // set percentage
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    // Polymorphism
    @Override
    public void generateCertificate() {
        if (courseType.equalsIgnoreCase("short")) {
            System.out.println("Basic Certificate issued to " + name);
        } else {
            System.out.println("Professional Certificate issued to " + name);
        }
    }
}