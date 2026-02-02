package com.streamapi.eventwelcome;

import java.util.Arrays;
import java.util.List;

public class EventWelcome {

    public static void main(String[] args) {

        List<String> attendees = Arrays.asList(
            "Sunny",
            "Rahul",
            "Amit",
            "Neha",
            "Priya"
        );

        attendees.forEach(name -> 
            System.out.println("Welcome to the event, " + name + "!")
        );
    }
}
