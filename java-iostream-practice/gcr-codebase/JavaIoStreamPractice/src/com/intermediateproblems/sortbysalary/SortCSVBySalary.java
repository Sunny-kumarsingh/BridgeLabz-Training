package com.intermediateproblems.sortbysalary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCSVBySalary {

    public static void main(String[] args) {

        String inputFile =
            "C:\\Users\\sunny\\Desktop\\Java programming workspace\\java-iostream-practice\\gcr-codebase\\JavaIoStreamPractice\\src\\sampleCSVfile\\employees.csv";

        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {

            String line;

            // skip header
            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                employees.add(
                    new Employee(
                        data[1],                  
                        data[2],                 
                        Integer.parseInt(data[3]) 
                    )
                );
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // sort by salary DESE
        Collections.sort(employees, new SalaryDescComparator());

        System.out.println("Top 5 Highest Paid Employees");
        System.out.println("-----------------------------");

        for (int i = 0; i < Math.min(5, employees.size()); i++) {
            Employee e = employees.get(i);
            System.out.println(
                e.getName() + " | " +
                e.getDepartment() + " | " +
                e.getSalary()
            );
        }
    }
}
