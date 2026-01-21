package com.collections.setinterface;
import java.util.HashSet;
import java.util.Set;

public class CheckSubset {
    public static void main(String[] args) {

        // Set1 (possible subset)
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);

        // Set2 (main set)
        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Check subset
        boolean isSubset = set2.containsAll(set1);

        // Output
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Is Set1 a subset of Set2? " + isSubset);
    }
}
