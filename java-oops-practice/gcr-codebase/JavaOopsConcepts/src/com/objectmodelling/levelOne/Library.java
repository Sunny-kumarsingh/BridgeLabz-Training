package com.objectmodelling.levelOne;

	import java.util.ArrayList;

	class Library {
	    String libraryName;
	    ArrayList<Book> books;

	    Library(String libraryName) {
	        this.libraryName = libraryName;
	        this.books = new ArrayList<>();
	    }

	    void addBook(Book book) {
	        books.add(book);
	    }

	    void showBooks() {
	        System.out.println("\nLibrary: " + libraryName);
	        for (Book book : books) {
	            book.displayBook();
	        }
	    }
	}



