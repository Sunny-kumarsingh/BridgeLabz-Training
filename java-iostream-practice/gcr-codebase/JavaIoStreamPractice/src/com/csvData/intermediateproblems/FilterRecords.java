package com.csvData.intermediateproblems;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterRecords {
	
	public static void main(String[] args) {
		
        String filePath =
        		"C:\\Users\\sunny\\Desktop\\Java programming workspace\\java-iostream-practice\\gcr-codebase\\JavaIoStreamPractice\\src\\sampleCSVfile\\studentsFilter.csv";
        
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
        	
        	br.readLine();
        	String line;
        	while((line = br.readLine())!= null) {
        		
        		String[] data = line.split(",");
        		String name = data[0];
        		int marks = Integer.parseInt(data[1]);
        		
        		if(marks >= 80) {
        			System.out.println(name + "  " + marks);
        		}
         		
        	}
        	br.close();
        	
        }catch(IOException e) {
        	e.printStackTrace();
        }

	}

}
