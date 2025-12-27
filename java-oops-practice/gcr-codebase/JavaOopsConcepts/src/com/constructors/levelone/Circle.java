package com.constructors.levelone;

public class Circle {
	
	double radius = 0;
	
	
	//Default constructor;
	Circle(){
		this(1.2);
		
	}
	
	//user define constructor
	Circle(double radius){
		this.radius = radius;
	}
	
	void display() {
        System.out.println("Radius is " + radius);
    }
	
}
