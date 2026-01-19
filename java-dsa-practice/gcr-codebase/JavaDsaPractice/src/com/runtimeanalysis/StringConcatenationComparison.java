package com.runtimeanalysis;
import java.util.Scanner;

public class StringConcatenationComparison {

    // Using String
    public static long testString(int n) {
        String s = "";
        long start = System.nanoTime();

        for (int i = 0; i < n; i++) {
            s = s + "a";   
        }

        long end = System.nanoTime();
        return end - start;
    }

    // Using StringBuilder 
    public static long testStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        long start = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sb.append("a");
        }

        long end = System.nanoTime();
        return end - start;
    }

    // Using StringBuffer (Thread-safe, slower than StringBuilder)
    public static long testStringBuffer(int n) {
        StringBuffer sb = new StringBuffer();
        long start = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sb.append("a");
        }

        long end = System.nanoTime();
        return end - start;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of concatenations: ");
        int n = sc.nextInt();

        // Avoid String test for very large input
        if (n <= 100000) {
            long timeString = testString(n);
            System.out.println("String Time: " + timeString / 1_000_000 + " ms");
        } else {
            System.out.println("String Time: Skipped (Too slow for large N)");
        }

        long timeBuilder = testStringBuilder(n);
        System.out.println("StringBuilder Time: " + timeBuilder / 1_000_000 + " ms");

        long timeBuffer = testStringBuffer(n);
        System.out.println("StringBuffer Time: " + timeBuffer / 1_000_000 + " ms");
        sc.close();
    }
}