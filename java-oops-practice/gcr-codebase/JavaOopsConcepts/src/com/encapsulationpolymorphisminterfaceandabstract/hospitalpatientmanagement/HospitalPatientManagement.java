package com.encapsulationpolymorphisminterfaceandabstract.hospitalpatientmanagement;

public class HospitalPatientManagement {

    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Ravi", 45, 5, 2000);
        Patient p2 = new OutPatient(102, "Suman", 30, 500);

        Patient[] patients = { p1, p2 };

        for (Patient p : patients) {

            p.getPatientDetails();

            if (p instanceof MedicalRecord) {
                MedicalRecord m = (MedicalRecord) p;
                m.addRecord("General Checkup");
                m.viewRecords();
            }

            System.out.println("Total Bill : " + p.calculateBill());
            System.out.println("-----------------------------");
        }
    }
}

