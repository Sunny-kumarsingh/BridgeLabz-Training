package com.runtimeanalysis;
import java.io.*;
import java.util.Scanner;

public class FileReadingComparison {

    // Reading file using FileReader 
    public static long readUsingFileReader(String filePath) throws IOException {
        FileReader reader = new FileReader(filePath);
        long start = System.nanoTime();

        while (reader.read() != -1) {
            // reading character by character
        }

        long end = System.nanoTime();
        reader.close();
        return end - start;
    }

    // Reading file using InputStreamReader
    public static long readUsingInputStreamReader(String filePath) throws IOException {
        InputStreamReader reader =
                new InputStreamReader(new FileInputStream(filePath));

        long start = System.nanoTime();

        while (reader.read() != -1) {
            // reading bytes and converting to characters
        }

        long end = System.nanoTime();
        reader.close();
        return end - start;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();

        // FileReader timing
        long timeFileReader = readUsingFileReader(filePath);
        System.out.println("FileReader Time: " + timeFileReader / 1_000_000 + " ms");

        // InputStreamReader timing
        long timeInputStreamReader = readUsingInputStreamReader(filePath);
        System.out.println("InputStreamReader Time: " + timeInputStreamReader / 1_000_000 + " ms");
        sc.close();
    }
}