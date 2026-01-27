package com.intermediateproblems;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ModifyCSVFile {
	
	  public static void main(String[] args) {

	        String inputFile = "C:\\Users\\sunny\\Desktop\\Java programming workspace\\java-iostream-practice\\gcr-codebase\\JavaIoStreamPractice\\src\\sampleCSVfile\\employees.csv";
	        String outputFile = "C:\\Users\\sunny\\Desktop\\Java programming workspace\\java-iostream-practice\\gcr-codebase\\JavaIoStreamPractice\\src\\sampleCSVfileoutput\\employees_updated.csv";

	        try (
	            BufferedReader br = new BufferedReader(new FileReader(inputFile));
	            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
	        ) {

	            String line;

	            // read & write header
	            line = br.readLine();
	            bw.write(line);
	            bw.newLine();

	            while ((line = br.readLine()) != null) {

	                String[] data = line.split(",");

	                String department = data[2];
	                double salary = Double.parseDouble(data[3]);

	                // IT department 10% hike
	                if (department.equalsIgnoreCase("IT")) {
	                    salary = salary + (salary * 0.10);
	                }

	                // update salary back
	                data[3] = String.valueOf((int) salary);

	                // rebuild CSV line
	                bw.write(String.join(",", data));
	                bw.newLine();
	            }

	            System.out.println("CSV updated successfully");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

}
