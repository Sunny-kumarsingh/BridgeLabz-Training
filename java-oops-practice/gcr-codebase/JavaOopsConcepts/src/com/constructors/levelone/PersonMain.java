package com.constructors.levelone;

public class PersonMain {
	public static void main(String[] args) {

        // Original object
        Person p1 = new Person("Raj", 25);
        p1.display();

        // Cloned object using copy constructor
        Person p2 = new Person(p1);
        p2.display();
    }
}
