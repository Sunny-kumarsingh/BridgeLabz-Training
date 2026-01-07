package com.bookbazaar;
import java.util.*;



public class Order {
	private String userName;
	private ArrayList<Book> books = new ArrayList<>();
	private ArrayList<Integer> quantities = new ArrayList<>();
	private String orderStatus = "CREATED";
	
	public Order(String userName) {
        this.userName = userName;
    }

    public void addBook(Book book, int quantity) {
        books.add(book);
        quantities.add(quantity);
    }

    public double calculateTotalCost() {

        double total = 0;

        for (int i = 0; i < books.size(); i++) {

            Book book = books.get(i);
            int quantity = quantities.get(i);

            double cost = book.price * quantity;

            if (book instanceof IDiscountable) {
                double discount =
                        ((IDiscountable) book).applyDiscount(quantity);
                cost = cost - discount; 
            }

            total += cost;

            // inventory update
            if (book instanceof PrintedBook) {
                book.reduceStock(quantity);
            }
        }
        return total;
    }

    protected void updateOrderStatus(String status) {
        this.orderStatus = status;
    }

    public String getOrderStatus() {
        return orderStatus;
    }
}
