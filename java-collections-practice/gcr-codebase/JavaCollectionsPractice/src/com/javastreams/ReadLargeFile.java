package com.javastreams;
import java.io.*;

public class ReadLargeFile {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\sunny\\Desktop\\New folder\\Data Warehousing and Data Mining_final.pdf";

        try (
            BufferedReader br =
                new BufferedReader(new FileReader(filePath))
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
