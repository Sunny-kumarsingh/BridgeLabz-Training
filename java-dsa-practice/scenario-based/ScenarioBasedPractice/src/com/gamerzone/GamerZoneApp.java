package com.gamerzone;
public class GamerZoneApp {

    public static void main(String[] args) {

        Player[] players = {
            new Player("Alex", 820),
            new Player("Sam", 950),
            new Player("Riya", 880),
            new Player("John", 910),
            new Player("Maya", 870)
        };

        System.out.println("Before Ranking:");
        display(players);

        QuickSort.sort(players, 0, players.length - 1);

        System.out.println("After Ranking (Leaderboard):");
        display(players);
    }

    private static void display(Player[] arr) {
        for (Player p : arr) {
            System.out.println(p.getName() + " -> " + p.getScore());
        }
        System.out.println();
    }
}
