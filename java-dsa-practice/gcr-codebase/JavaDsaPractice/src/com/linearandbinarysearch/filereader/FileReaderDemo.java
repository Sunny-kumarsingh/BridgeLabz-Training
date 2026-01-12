package com.linearandbinarysearch.filereader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderDemo {
	public static void main(String args[]) {
	  String filePath = "C:\\Users\\sunny\\Desktop\\New folder (2)\\Hello.txt"; 

      BufferedReader reader = null;

      try {
          // Create FileReader
          FileReader fileReader = new FileReader(filePath);

          // Wrap FileReader with BufferedReader
          reader = new BufferedReader(fileReader);

          String line;

          // Read file line by line
          while ((line = reader.readLine()) != null) {
              System.out.println(line);
          }

      } catch (IOException e) {
          System.out.println("Error reading file: " + e.getMessage());
      } finally {
          // Close the file
          try {
              if (reader != null) {
                  reader.close();
              }
          } catch (IOException e) {
              System.out.println("Error closing file");
          }
      }
	}
}
