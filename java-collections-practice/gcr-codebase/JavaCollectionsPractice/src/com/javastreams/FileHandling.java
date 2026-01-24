package com.javastreams;
import java.io.*;

public class FileHandling {
	
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("C:\\Users\\sunny\\Desktop\\New folder (2)\\Hello.txt")){
			FileOutputStream fos = new FileOutputStream("C:\\Users\\sunny\\Desktop\\New folder (2)\\Output.txt");
			
			int byteData;
			while((byteData = fis.read()) != -1) {
				fos.write(byteData);
			}
			System.out.println("File read and write successfully");
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
