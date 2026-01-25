package com.collections.queueinterface.hospitaltriagesystem;
import java.util.Comparator;



class SeverityComparator implements Comparator<Patient> {
    @Override
    public int compare(Patient a, Patient b) {
        return b.severity - a.severity;
    }
}