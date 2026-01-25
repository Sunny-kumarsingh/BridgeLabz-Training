package com.collections.mapinterface.votingsystem;
import java.util.*;

public class VotingSystem {

    // Stores total votes (fast access)
    private Map<String, Integer> voteMap = new HashMap<>();

    // Maintains order in which votes are added
    private Map<String, Integer> insertionOrderMap = new LinkedHashMap<>();

    // Cast a vote
    public void vote(String candidate) {

        // HashMap logic
        if (voteMap.containsKey(candidate)) {
            voteMap.put(candidate, voteMap.get(candidate) + 1);
        } else {
            voteMap.put(candidate, 1);
        }

        // LinkedHashMap logic (same update)
        if (insertionOrderMap.containsKey(candidate)) {
            insertionOrderMap.put(candidate, insertionOrderMap.get(candidate) + 1);
        } else {
            insertionOrderMap.put(candidate, 1);
        }
    }

    // Display votes in insertion order
    public void displayInsertionOrder() {
        System.out.println("Votes in insertion order:");
        for (Map.Entry<String, Integer> e : insertionOrderMap.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    // Display votes in sorted order
    public void displaySortedResults() {
        TreeMap<String, Integer> sortedMap = new TreeMap<>(voteMap);

        System.out.println("Votes in sorted order:");
        for (Map.Entry<String, Integer> e : sortedMap.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
