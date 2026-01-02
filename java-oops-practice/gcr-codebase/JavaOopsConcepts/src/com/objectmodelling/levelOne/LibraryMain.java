package com.objectmodelling.levelOne;

public class LibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		    
		        Book b1 = new Book("Java Basics", "James Gosling");
		        Book b2 = new Book("Clean Code", "Robert C. Martin");
		        Book b3 = new Book("Effective Java", "Joshua Bloch");

		   
		        Library cityLibrary = new Library("City Library");
		        Library collegeLibrary = new Library("College Library");

		     
		        cityLibrary.addBook(b1);
		        cityLibrary.addBook(b2);

		          collegeLibrary.addBook(b2); 
		          collegeLibrary.addBook(b3);
		          
		        cityLibrary.showBooks();
		        collegeLibrary.showBooks();
		    }
		


	}


