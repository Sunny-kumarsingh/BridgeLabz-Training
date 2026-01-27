package com.json.practiceproblems;

import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJSONPractice {

    public static void main(String[] args) {

        JSONArray subjects = new JSONArray();
        subjects.put("Math");
        subjects.put("Science");
        subjects.put("Computer");

        JSONObject student = new JSONObject();
        student.put("name", "Sunny");
        student.put("age", 21);
        student.put("subjects", subjects);

        System.out.println(student.toString(4));
    }
}

