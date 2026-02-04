package com.json.handonpracticeproblems.JsonToXml;

import org.json.JSONObject;
import org.json.XML;

public class JsonToXml {

    public static void main(String[] args) {

        
        String jsonData = """
                {
                  "user": {
                    "id": 1,
                    "name": "Rahul",
                    "email": "rahul@gmail.com",
                    "age": 28
                  }
                }
                """;

        // Convert JSON String to JSONObject
        JSONObject jsonObject = new JSONObject(jsonData);

        // Convert JSONObject to XML
        String xml = XML.toString(jsonObject);

        System.out.println("Converted XML:\n");
        System.out.println(xml);
    }
}
