package com.json.practiceproblems;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ValidateJSONSyntax {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.readTree(new File("C:\\Users\\sunny\\Desktop\\Java programming workspace\\java-iostream-practice\\gcr-codebase\\JavaIoStreamPractice\\src\\sampleJSON\\user.json"));
            System.out.println("JSON is VALID");

        } catch (Exception e) {
            System.out.println("Invalid JSON");
            e.printStackTrace();
        }
    }
}
