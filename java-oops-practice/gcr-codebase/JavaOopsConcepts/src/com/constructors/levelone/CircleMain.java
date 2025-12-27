package com.constructors.levelone;

public class CircleMain {
	public static void main(String args[]) {
		
		//default constructor
		Circle c = new Circle();
		c.display();
		
		// Using parameterized constructor
        Circle c2 = new Circle(5.5);
        c2.display();
	}
}
