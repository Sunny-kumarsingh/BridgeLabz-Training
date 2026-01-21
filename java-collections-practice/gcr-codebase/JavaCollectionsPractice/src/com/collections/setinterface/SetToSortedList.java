package com.collections.setinterface;
import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {

        // Create HashSet
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        // Convert Set to List
        List<Integer> list = new ArrayList<>(set);


        Collections.sort(list);

        // Output
        System.out.println("Input Set: " + set);
        System.out.println("Sorted List: " + list);
    }
}
