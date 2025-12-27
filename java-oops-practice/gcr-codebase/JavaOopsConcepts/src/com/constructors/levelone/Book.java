package com.constructors.levelone;

public class Book {
	
	String title = "";
	String author = "";
	int price = 0;
	boolean available;
	
	
	public Book(){
		title = "Best Book of the world";
		author = "Sunny";
		price = 399;
	}
	public Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	// Method to borrow a book
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Sorry, book is not available.");
        }
    }
	
	public void display() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
        
    }

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //title, author, and price
	///	 Book b =new Book();
		// b.display();
		 
	   //  Book b2 = new Book("Java Programming", "James Gosling", 500);
	    // b2.display();

		 
		 
		

	//}

}
