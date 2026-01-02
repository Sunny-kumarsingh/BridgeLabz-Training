package com.inheritance.singleinheritance;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b = new Author(
                "Java Programming",
                2024,
                "Rohan Sharma",
                "Java developer and technical writer"
        );

        b.displayInfo();

	}

}
