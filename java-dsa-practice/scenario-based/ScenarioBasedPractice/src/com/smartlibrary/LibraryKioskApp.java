package com.smartlibrary;
public class LibraryKioskApp {
    public static void main(String[] args) {
        // Shelf with a capacity of 5 books
        Book[] myShelf = new Book[5];
        int count = 0;

        // borrowing books one by one
        String[] borrowedTitles = {"Java Programming", "Data Structures", "Algorithms", "C++ Basics", "Big Data"};

        System.out.println("--- Library Digital Kiosk Issuing Books ---");

        for (String title : borrowedTitles) {
            Book newBook = new Book(title);
            
            //Add and sort simultaneously
            LibrarySorter.insertAndSort(myShelf, count, newBook);
            count++;

            System.out.println("\nIssued: " + title);
            System.out.println("Current Sorted Shelf:");
            displayShelf(myShelf, count);
        }
    }

    public static void displayShelf(Book[] shelf, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + shelf[i].title);
        }
    }
}