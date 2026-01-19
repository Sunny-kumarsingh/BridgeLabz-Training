package com.runtimeanalysis;
import java.util.Scanner;

public class FibonacciComparison {

    // Recursive Fibonacci 
    public static int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci 
    public static int fibonacciIterative(int n) {
        if (n <= 1)
            return n;

        int a = 0, b = 1, sum = 0;

        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fibonacci number (n): ");
        int n = sc.nextInt();

        // Recursive Fibonacci timing (limit to avoid huge delay)
        if (n <= 40) {
            long startRec = System.nanoTime();
            int recResult = fibonacciRecursive(n);
            long endRec = System.nanoTime();

            System.out.println("Recursive Fibonacci Result: " + recResult);
            System.out.println("Recursive Time: " + (endRec - startRec) / 1_000_000 + " ms");
        } else {
            System.out.println("Recursive Fibonacci: Skipped (Too slow for large n)");
        }

        // Iterative Fibonacci timing
        long startItr = System.nanoTime();
        int itrResult = fibonacciIterative(n);
        long endItr = System.nanoTime();

        System.out.println("Iterative Fibonacci Result: " + itrResult);
        System.out.println("Iterative Time: " + (endItr - startItr) / 1_000_000 + " ms");
        sc.close();
    }
}