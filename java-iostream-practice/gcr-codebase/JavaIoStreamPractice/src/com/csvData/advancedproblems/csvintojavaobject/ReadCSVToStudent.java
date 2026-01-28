package com.csvData.advancedproblems.csvintojavaobject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSVToStudent {

    public static void main(String[] args) {

        String inputFile =
            "C:\\Users\\sunny\\Desktop\\Java programming workspace\\java-iostream-practice\\gcr-codebase\\JavaIoStreamPractice\\src\\sampleCSVfile\\students.csv";

        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {

            String line;

            // skip header
            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                Student student = new Student(
                        Integer.parseInt(data[0]), 
                        data[1],                   
                        Integer.parseInt(data[2]), 
                        Integer.parseInt(data[3]) 
                );

                students.add(student);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // print all students
        System.out.println("📚 Student List:");
        System.out.println("----------------");

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
