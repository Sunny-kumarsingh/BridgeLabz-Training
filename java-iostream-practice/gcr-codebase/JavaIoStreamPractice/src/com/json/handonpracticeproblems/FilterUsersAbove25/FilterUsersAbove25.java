package com.json.handonpracticeproblems.FilterUsersAbove25;

import org.json.JSONArray;
import org.json.JSONObject;

public class FilterUsersAbove25 {

    public static void main(String[] args) {

        // Sample JSON Array (users data)
        String jsonData = """
                [
                  {"id":1, "name":"Rahul", "age":23},
                  {"id":2, "name":"Amit", "age":28},
                  {"id":3, "name":"Neha", "age":30},
                  {"id":4, "name":"Pooja", "age":22}
                ]
                """;

        JSONArray jsonArray = new JSONArray(jsonData);

        System.out.println("Users older than 25:\n");

        for (int i = 0; i < jsonArray.length(); i++) {

            JSONObject user = jsonArray.getJSONObject(i);
            int age = user.getInt("age");

            if (age > 25) {
                System.out.println(user);
            }
        }
    }
}
