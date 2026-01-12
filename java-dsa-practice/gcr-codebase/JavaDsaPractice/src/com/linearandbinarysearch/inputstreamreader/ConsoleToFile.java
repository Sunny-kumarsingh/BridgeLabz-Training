package com.linearandbinarysearch.inputstreamreader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class ConsoleToFile {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\sunny\\Desktop\\New folder (2)\\output.txt";

        System.out.println("Enter text (type 'exit' to stop):");

        try (
            BufferedReader consoleReader =
                    new BufferedReader(new InputStreamReader(System.in));
            FileWriter writer = new FileWriter(filePath, true) // append mode
        ) {

            String input;

            while ((input = consoleReader.readLine()) != null) {

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                writer.write(input);
                writer.write(System.lineSeparator()); // new line
            }

            System.out.println("Input saved to file successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
