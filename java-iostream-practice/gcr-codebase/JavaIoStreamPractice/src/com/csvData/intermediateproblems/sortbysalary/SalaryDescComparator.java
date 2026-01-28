package com.csvData.intermediateproblems.sortbysalary;

import java.util.Comparator;

public class SalaryDescComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e2.getSalary() - e1.getSalary(); 
    }
}
