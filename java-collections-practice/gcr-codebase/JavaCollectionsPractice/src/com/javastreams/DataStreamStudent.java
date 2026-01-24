package com.javastreams;
import java.io.*;


public class DataStreamStudent {
	public static void main(String[] args) {
		String file = "C:\\Users\\sunny\\Desktop\\New Folder (2)\\studentDetails.txt";
		
		try(
				 DataOutputStream dos =
	                new DataOutputStream(new FileOutputStream(file))
		){
			dos.writeInt(101);
			dos.writeUTF("Sunny Kumar");
			dos.writeDouble(8.75);
			
			 System.out.println("Student data written successfully");
			
		} catch (IOException e) {
            e.printStackTrace();
        }
		
		try (
		            DataInputStream dis =
		                new DataInputStream(new FileInputStream(file))
		){
			int rollNo = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("\nStudent Details:");
            System.out.println("Roll No: " + rollNo);
            System.out.println("Name   : " + name);
            System.out.println("GPA    : " + gpa);
		} 
		catch (IOException e) {
            e.printStackTrace();
        }	
	}
}
