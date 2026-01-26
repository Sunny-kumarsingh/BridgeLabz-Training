package com.reflection.Advancedlevel.createcustomobjectmapper;
import java.util.HashMap;
import java.util.Map;

public class TestMapper {

    public static void main(String[] args) {

        Map<String, Object> data = new HashMap<>();
        data.put("id", 101);
        data.put("name", "Sunny");
        data.put("email", "sunny@example.com");

        User user = ObjectMapperUtil.toObject(User.class, data);

        user.display();
    }
}
