package com.bankmanagementsystem;

class Patient {

    private String name;
    private int age;
    private String medicalHistory;
    protected String patientType;

    // Normal Admission
    Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.patientType = "Normal Patient";
    }

    // Emergency Admission (Overloaded Constructor)
    Patient(String name, int age, String medicalHistory) {
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
        this.patientType = "Emergency Patient";
    }

    public String getSummary() {
        return "Name: " + name + ", Age: " + age + ", Type: " + patientType;
    }

    void displayInfo() {
        System.out.println(getSummary());
    }
}