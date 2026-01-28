package com.json.practiceproblems.validation;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ValidateJSON {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            User user = mapper.readValue(
                new File("C:\\Users\\sunny\\Desktop\\Java programming workspace\\java-iostream-practice\\gcr-codebase\\JavaIoStreamPractice\\src\\sampleJSON\\user.json"),
                User.class
            );

            System.out.println("JSON structure is VALID");
            System.out.println("Name: " + user.getName());

        } catch (Exception e) {
            System.out.println("JSON structure is INVALID");
            e.printStackTrace();
        }
    }
}
