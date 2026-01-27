package com.advancedproblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Pattern;
import java.io.IOException;

public class ValidateCSVData {
	
	
	private static final String regexEmail = "^[a-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	private static final String regexPhNum = "^\\d{10}"; 
	
	private static final Pattern email_regex = Pattern.compile(regexEmail);
	private static final Pattern phone_regex = Pattern.compile(regexPhNum);
	
	public static void main(String[] args) {
		
	
		String inputFile =
				"C:\\Users\\sunny\\Desktop\\Java programming workspace\\java-iostream-practice\\gcr-codebase\\JavaIoStreamPractice\\src\\sampleCSVfile\\employes.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(inputFile))){
			
			String line;
			
			br.readLine();
			
			while((line = br.readLine()) != null) {
				String[] data = line.split(",");
				
				String email = data[2];
				String phone = data[3];
				
				boolean validEmail = email_regex.matcher(email).matches();
				boolean validPhone = phone_regex.matcher(phone).matches();
				
				if (!validEmail || !validPhone) {

                    System.out.println("Invalid Row Found:");
                    System.out.println("Row Data : " + line);

                    if (!validEmail) {
                        System.out.println("Error    : Invalid Email Format");
                    }

                    if (!validPhone) {
                        System.out.println("Error    : Phone number must be exactly 10 digits");
                    }

                    System.out.println("----------------------------------");
                }
				
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
