package com.objectmodelling;

import java.util.ArrayList;
import java.util.List;

class Patient {
    private int id;
    private String name;
    private List<Doctor> doctors;

    public Patient(int id, String name) {
        this.id = id;
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void showDoctors() {
        System.out.println("Doctors consulted by " + name + ":");
        for (Doctor d : doctors) {
            System.out.println("- " + d.getName());
        }
    }
}

