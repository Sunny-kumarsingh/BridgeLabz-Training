package com.streamapi.doctoravailability;
import java.util.*;

public class HospitalApp {

    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Amit", "Cardiology", true),
            new Doctor("Dr. Neha", "Neurology", false),
            new Doctor("Dr. Rahul", "Orthopedics", true),
            new Doctor("Dr. Priya", "Dermatology", true),
            new Doctor("Dr. Karan", "Pediatrics", false)
        );

        doctors.stream()
               .filter(d -> d.availableOnWeekend)
               .sorted(Comparator.comparing(d -> d.specialty))
               .forEach(System.out::println);
    }
}
