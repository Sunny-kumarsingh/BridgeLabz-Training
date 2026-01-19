package com.eduresults;

public class Student {
	private String name;
	private int marks;
	private String district;
	
	public Student(String name, int marks, String district) {
		this.name = name;
		this.marks = marks;
		this.district = district;
	}
	
	public String getName() {
		return name;
		
	}
	
	public int getMarks() {
		
		return marks;
		
	}
	public String getDistrict() {
		
		return district;
	}

}
