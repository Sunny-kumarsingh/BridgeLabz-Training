package com.travellog;
import java.io.*;

class WriteTrips {

    public static void main(String[] args) {

        try {
            ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("trips.dat"));

            oos.writeObject(new Trip(
                "Paris", "France", 7, "Visited Eiffel Tower"));

            oos.writeObject(new Trip(
                "Rome", "Italy", 4, "Colosseum and food"));

            oos.writeObject(new Trip(
                "Paris", "France", 6, "Museums and cafes"));

            oos.close();

            System.out.println("Trips saved successfully");

        } catch (Exception e) {
            System.out.println("Error while saving trips");
        }
    }
}
