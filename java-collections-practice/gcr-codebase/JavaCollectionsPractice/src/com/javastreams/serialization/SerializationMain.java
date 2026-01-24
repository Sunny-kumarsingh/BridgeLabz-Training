package com.javastreams.serialization;

import java.io.*;
import java.util.*;

public class SerializationMain {
	public static void main(String[] args) {
		
		String filePath = "C:\\Users\\sunny\\Desktop\\New Folder (2)\\employee_details.txt";
		
		List<Employee>employees = new ArrayList<>();
		employees.add(new Employee(101, "Amit", "IT", 50000));
        employees.add(new Employee(102, "Neha", "HR", 45000));
        employees.add(new Employee(103, "Rahul", "Finance", 60000));
        
        try( ObjectOutputStream oos = 
        		new ObjectOutputStream(new FileOutputStream(filePath))){
        	  oos.writeObject(employees);
              System.out.println("Employees serialized successfully.");
        	
        }catch(IOException e) {
        	e.printStackTrace();
        }
        // 🔸 Deserialization (Read from file)
        try (
            ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream(filePath))
        ) {
            List<Employee> empList =
                (List<Employee>) ois.readObject();

            System.out.println("\nDeserialized Employee Data:");
            for (Employee emp : empList) {
                System.out.println(emp);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
		
	}

}
