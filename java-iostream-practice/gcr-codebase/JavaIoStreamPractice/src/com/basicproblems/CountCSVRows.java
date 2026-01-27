package com.basicproblems;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\sunny\\Desktop\\Java programming workspace\\java-iostream-practice\\gcr-codebase\\JavaIoStreamPractice\\src\\com\\sampleCSVfile\\students.txt";
        String line;
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // Skip header row
            br.readLine();

            // Count remaining rows
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    count++;
                }
            }

            System.out.println("Total number of records: " + count);

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
            e.printStackTrace();
        }
    }
}
