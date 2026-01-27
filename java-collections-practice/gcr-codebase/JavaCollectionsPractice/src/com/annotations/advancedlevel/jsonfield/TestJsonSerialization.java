package com.annotations.advancedlevel.jsonfield;

public class TestJsonSerialization {

    public static void main(String[] args) {

        User user = new User("Sunny", 22, "secret123");

        String json = JsonSerializer.toJson(user);
        System.out.println(json);
    }
}
