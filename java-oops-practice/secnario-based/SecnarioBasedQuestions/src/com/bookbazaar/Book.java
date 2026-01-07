package com.bookbazaar;

public class Book {
	protected String title;
	protected String author;
	protected double price;
	private int stock;
	
	
	public Book(String title, String author, double price, int stock) {
	       this.title = title;
	       this.author = author;
	       this.price = price;
	       this.stock = stock;
	}
	 
	 public Book(String title, String author, double price) {
	      this(title, author, price, 0);
	 }
	
	 public int getStock() {
	        return stock;
	 }
	 
	 protected void reduceStock(int quantity) {
	        if (quantity <= stock) {
	            stock -= quantity;
	        }
	 }
	 
	 
}
