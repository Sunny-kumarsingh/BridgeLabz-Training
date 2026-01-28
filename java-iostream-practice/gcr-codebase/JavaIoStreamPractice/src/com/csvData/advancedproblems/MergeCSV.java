package com.csvData.advancedproblems;

import java.io.*;
import java.util.*;

public class MergeCSV {
    public static void main(String[] args) {

        Map<String, String> studentMap = new HashMap<>();

        try (
            BufferedReader br1 = new BufferedReader(
                new FileReader("C:\\Users\\sunny\\Desktop\\Java programming workspace\\java-iostream-practice\\gcr-codebase\\JavaIoStreamPractice\\src\\sampleCSVfile\\student1.csv")
            );
            BufferedReader br2 = new BufferedReader(
                new FileReader("C:\\Users\\sunny\\Desktop\\Java programming workspace\\java-iostream-practice\\gcr-codebase\\JavaIoStreamPractice\\src\\sampleCSVfile\\student2.csv")
            );
            BufferedWriter bw = new BufferedWriter(
                new FileWriter("C:\\Users\\sunny\\Desktop\\Java programming workspace\\java-iostream-practice\\gcr-codebase\\JavaIoStreamPractice\\src\\sampleCSVfileoutput\\merged_students.csv")
            )
        ) {

            String line;

            // skip header of students1
            br1.readLine();

            while ((line = br1.readLine()) != null) {
                String[] data = line.split(",");
                studentMap.put(data[0], data[1] + "," + data[2]);
            }

            // write header to merged file
            bw.write("ID,Name,Age,Marks,Grade\n");

            // skip header of students2
            br2.readLine();

            while ((line = br2.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];

                if (studentMap.containsKey(id)) {
                    bw.write(id + "," + studentMap.get(id) + "," + data[1] + "," + data[2] + "\n");
                }
            }

            System.out.println("CSV files merged successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Error occurred: " + e.getMessage());
        }
    }
}
