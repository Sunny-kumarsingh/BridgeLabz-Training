package com.json.handonpracticeproblems;
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadJson {
    public static void main(String[] args) throws Exception {
    	
    	 String filePath = 
         		"C:\\Users\\sunny\\Desktop\\Java programming workspace\\java-iostream-practice\\gcr-codebase\\JavaIoStreamPractice\\src\\sampleJSON\\data.json";

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        StringBuilder json = new StringBuilder();

        while ((line = br.readLine()) != null) {
            json.append(line);
        }
        br.close();

        // Remove { } and split
        String content = json.toString()
                             .replace("{", "")
                             .replace("}", "")
                             .replace("\"", "");

        String[] pairs = content.split(",");

        for (String pair : pairs) {
            String[] keyValue = pair.split(":");
            System.out.println(keyValue[0].trim() + " : " + keyValue[1].trim());
        }
    }
}
