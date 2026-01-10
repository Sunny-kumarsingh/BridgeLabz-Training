package com.bookshelf;
import java.util.*;

class BookShelf {

    // genre → list of books
    private Map<String, LinkedList<Book>> catalog = new HashMap<>();

    // optional: avoid duplicates
    private Set<Book> uniqueBooks = new HashSet<>();

    // Add book (returning or new entry)
    public void addBook(String genre, Book book) {

        // Avoid duplication
        if (!uniqueBooks.add(book)) {
            System.out.println("Duplicate book ignored: " + book);
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);

        System.out.println("Book added to " + genre + ": " + book);
    }

    // Borrow book (delete)
    public void borrowBook(String genre, Book book) {
        LinkedList<Book> list = catalog.get(genre);

        if (list != null && list.remove(book)) {
            uniqueBooks.remove(book);
            System.out.println("Book borrowed: " + book);
        } else {
            System.out.println("Book not available.");
        }
    }

    // Display catalog
    public void displayCatalog() {
        for (String genre : catalog.keySet()) {
            System.out.println("\nGenre: " + genre);
            for (Book book : catalog.get(genre)) {
                System.out.println(" - " + book);
            }
        }
    }
}
