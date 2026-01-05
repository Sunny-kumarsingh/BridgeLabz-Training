package com.linkedlist.singlelinkedlist.studentrecordmanagementsystem;

public class StudentMain {
	public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(1, "Rahul", 20, 'A');
        list.addAtEnd(2, "Ankit", 21, 'B');
        list.addAtPosition(2, 3, "Sneha", 19, 'A');

        list.display();

        list.search(2);
        list.updateGrade(2, 'A');
        list.deleteByRollNumber(1);

        System.out.println("\nAfter Deletion:");
        list.display();
    }
}
