package com.smartshelf;
public class SmartShelf {

    // Insertion Sort by book title (A → Z)
    public static void insertionSort(Book[] books, int n) {

        for (int i = 1; i < n; i++) {
            Book key = books[i];
            int j = i - 1;

            // Shift books greater than key to one position ahead
            while (j >= 0 && books[j].title.compareTo(key.title) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = key;
        }
    }

    // Print book list
    public static void printBooks(Book[] books, int n) {
        System.out.println("📚 Reading List:");
        for (int i = 0; i < n; i++) {
            System.out.println(books[i].title);
        }
    }
}
