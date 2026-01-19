package com.fitnesstracker;
public class FitnessTrackerApp {

    public static void main(String[] args) {

        User[] users = {
                new User("Amit", 8000),
                new User("Neha", 12000),
                new User("Rahul", 9500),
                new User("Sneha", 15000),
                new User("Karan", 7000)
        };

        FitnessSorter.bubbleSort(users);

        System.out.println("Daily Step Count Leaderboard:");
        for (int i = 0; i < users.length; i++) {
            System.out.println((i + 1) + ". " + users[i].name +
                    " - " + users[i].steps + " steps");
        }
    }
}
