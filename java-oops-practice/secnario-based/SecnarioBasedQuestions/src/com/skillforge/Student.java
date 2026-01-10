package com.skillforge;
class Student extends User {
    private int completedModules;
    private double grade;

    public Student(String name, String email) {
        super(name, email);
        this.completedModules = 0;
    }

    public void completeModule() {
        completedModules++;
    }

    public int getCompletedModules() {
        return completedModules;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }
}
