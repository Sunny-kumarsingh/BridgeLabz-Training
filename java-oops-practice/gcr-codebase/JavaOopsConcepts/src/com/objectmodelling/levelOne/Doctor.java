package com.objectmodelling.levelOne;

import java.util.ArrayList;
import java.util.List;

class Doctor {
    private int id;
    private String name;
    private String specialization;
    private List<Patient> patients;

    public Doctor(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Association + Communication
    public void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);

        System.out.println("Consultation:");
        System.out.println("Doctor " + name + " (" + specialization + 
                           ") is consulting Patient " + patient.getName());
    }

    public void showPatients() {
        System.out.println("Patients treated by Dr. " + name + ":");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}
