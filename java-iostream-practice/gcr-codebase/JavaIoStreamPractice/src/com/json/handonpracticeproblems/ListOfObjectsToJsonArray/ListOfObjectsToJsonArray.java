package com.json.handonpracticeproblems.ListOfObjectsToJsonArray;

import org.json.JSONArray;
import org.json.JSONObject;
import java.util.*;

public class ListOfObjectsToJsonArray {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(1, "Rahul", 85),
                new Student(2, "Amit", 90)
        );

        JSONArray jsonArray = new JSONArray();

        for (Student s : students) {

            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id", s.id);
            jsonObject.put("name", s.name);
            jsonObject.put("marks", s.marks);

            jsonArray.put(jsonObject);
        }

        System.out.println(jsonArray.toString(2)); 
    }
}
