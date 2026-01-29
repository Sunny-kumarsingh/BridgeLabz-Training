package com.travellog;
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class TravelLog {

    public static void main(String[] args) {

        List<Trip> trips = new ArrayList<>();

        try {
            ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("trips.dat"));

            while (true) {
                try {
                    Trip t = (Trip) ois.readObject();
                    trips.add(t);
                } catch (EOFException e) {
                    break;
                }
            }
            ois.close();

        } catch (Exception e) {
            System.out.println("Error reading trips");
        }
        
        Pattern cityPattern = Pattern.compile("[A-Za-z]+");

        System.out.println("Cities visited:");
        for (int i = 0; i < trips.size(); i++) {
            Matcher m = cityPattern.matcher(trips.get(i).city);
            if (m.find()) {
                System.out.println(m.group());
            }
        }
        
        System.out.println("\nTrips longer than 5 days:");
        for (int i = 0; i < trips.size(); i++) {
            if (trips.get(i).days > 5) {
                System.out.println(trips.get(i).city + " - " + trips.get(i).days);
            }
        }
        
        
        Set<String> countries = new HashSet<>();

        for (int i = 0; i < trips.size(); i++) {
            countries.add(trips.get(i).country);
        }

        System.out.println("\nUnique countries:");
        for (String c : countries) {
            System.out.println(c);
        }

        Map<String, Integer> cityCount = new HashMap<>();

        for (int i = 0; i < trips.size(); i++) {
            String city = trips.get(i).city;
            Integer count = cityCount.get(city);

            if (count == null)
                cityCount.put(city, 1);
            else
                cityCount.put(city, count + 1);
        }

        List<Map.Entry<String, Integer>> list =
            new ArrayList<>(cityCount.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> e1,
                               Map.Entry<String, Integer> e2) {
                return e2.getValue() - e1.getValue();
            }
        });

        System.out.println("\nTop 3 cities:");
        for (int i = 0; i < 3 && i < list.size(); i++) {
            System.out.println(
                list.get(i).getKey() + " -> " + list.get(i).getValue());
        }

    }
}   
