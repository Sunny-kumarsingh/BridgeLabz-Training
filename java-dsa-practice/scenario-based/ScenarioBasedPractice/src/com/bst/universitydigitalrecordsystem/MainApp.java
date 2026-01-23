package com.bst.universitydigitalrecordsystem;



public class MainApp {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Insertion
        bst.root = bst.insert(bst.root, new Student(50, "Amit"));
        bst.root = bst.insert(bst.root, new Student(30, "Neha"));
        bst.root = bst.insert(bst.root, new Student(70, "Rahul"));
        bst.root = bst.insert(bst.root, new Student(20, "Priya"));
        bst.root = bst.insert(bst.root, new Student(40, "Karan"));

        // Display sorted list
        System.out.println("Student Records (Sorted):");
        bst.inorder(bst.root);

        // Search
        int roll = 40;
        Node result = bst.search(bst.root, roll);
        if (result != null)
            System.out.println("\nStudent found: " + result.data.name);
        else
            System.out.println("\nStudent not found");

        // Delete
        System.out.println("\nDeleting roll number 30...");
        bst.root = bst.delete(bst.root, 30);

        // Display after deletion
        System.out.println("\nRecords after deletion:");
        bst.inorder(bst.root);
    }
}
