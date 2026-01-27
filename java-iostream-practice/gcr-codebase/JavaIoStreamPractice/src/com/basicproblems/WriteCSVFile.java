package com.basicproblems;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSVFile {

    public static void main(String[] args) {

        String filePath = 
        		"C:\\Users\\sunny\\Desktop\\Java programming workspace\\java-iostream-practice\\gcr-codebase\\JavaIoStreamPractice\\src\\sampleCSVfileoutput\\employees.csv";

        try (FileWriter writer = new FileWriter(filePath)) {

            // Write header
            writer.append("ID,Name,Department,Salary\n");

            // Write records
            writer.append("101,Sunny,IT,50000\n");
            writer.append("102,Amit,HR,45000\n");
            writer.append("103,Neha,Finance,60000\n");
            writer.append("104,Rahul,IT,55000\n");
            writer.append("105,Priya,Marketing,48000\n");

            System.out.println("CSV file written successfully!");

        } catch (IOException e) {
            System.out.println("Error writing CSV file");
            e.printStackTrace();
        }
    }
}
