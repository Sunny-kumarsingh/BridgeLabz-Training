package com.smartlibrary;
public class LibrarySorter {

    public static void insertAndSort(Book[] shelf, int currentSize, Book newBook) {
        int i = currentSize - 1;

        /* Compare the new book title with existing titles.
           If the existing title is alphabetically greater (using compareTo),
           shift it one position to the right.
        */
        while (i >= 0 && shelf[i].title.compareToIgnoreCase(newBook.title) > 0) {
            shelf[i + 1] = shelf[i];
            i--;
        }

        // Place the new book in its correct gap
        shelf[i + 1] = newBook;
    }
}