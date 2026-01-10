package com.bookshelf;
public class LibraryApp {
    public static void main(String[] args) {

        BookShelf shelf = new BookShelf();

        Book b1 = new Book("hello", "Sunny", "ISBN001");
        Book b2 = new Book("Animal Farm", "Rohit", "ISBN002");
        Book b3 = new Book("Brief History", "Stephen Hawking", "ISBN003");

        shelf.addBook("Fiction", b1);
        shelf.addBook("Fiction", b2);
        shelf.addBook("Science", b3);

        shelf.displayCatalog();

        shelf.borrowBook("Fiction", b1);

        shelf.displayCatalog();
    }
}
