package com.bookbazaar;
public class BookBazaarApp {

    public static void main(String[] args) {

        Book ebook = new EBook("Clean Code", "Robert C. Martin", 500);
        Book printedBook = new PrintedBook("Java Basics", "James Gosling", 300, 10);

        Order order = new Order("Sunny Kumar");

        order.addBook(ebook, 1);
        order.addBook(printedBook, 2);

        System.out.println("Total Amount: ?" + order.calculateTotalCost());
        System.out.println("Order Status: " + order.getOrderStatus());
        System.out.println("Remaining Stock: " + printedBook.getStock());
    }
}
