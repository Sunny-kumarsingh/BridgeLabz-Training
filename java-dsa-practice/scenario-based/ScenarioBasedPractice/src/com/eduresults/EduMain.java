package com.eduresults;
import java.util.Scanner;

public class EduMain {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of student ");
		int n = sc.nextInt();
		sc.nextLine();
		Student[] students = new Student[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter student name ");
			String name = sc.nextLine();
			System.out.println("Enter Marks");
			int marks = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter district");
			String district = sc.next();
			sc.nextLine();
			
			students[i] = new Student(name, marks, district);
		}
		
		 RankGennerator generator = new RankGennerator();
	     generator.generateRankSheet(students);
		
		sc.close();
	}

}
