package com.reflection.Advancedlevel.jsonrepresentation;
public class TestJson {

    public static void main(String[] args) {

        Person p = new Person(101, "Sunny", true);

        String json = JsonUtil.toJson(p);
        System.out.println(json);
    }
}
