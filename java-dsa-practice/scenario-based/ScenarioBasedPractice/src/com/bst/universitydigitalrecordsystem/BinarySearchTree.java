package com.bst.universitydigitalrecordsystem;



class BinarySearchTree {
    Node root;

    // Insert
    Node insert(Node root, Student student) {
        if (root == null) {
            return new Node(student);
        }

        if (student.rollNo < root.data.rollNo)
            root.left = insert(root.left, student);
        else if (student.rollNo > root.data.rollNo)
            root.right = insert(root.right, student);

        return root;
    }

    // Search
    Node search(Node root, int rollNo) {
        if (root == null || root.data.rollNo == rollNo)
            return root;

        if (rollNo < root.data.rollNo)
            return search(root.left, rollNo);

        return search(root.right, rollNo);
    }

    //Delete
    Node delete(Node root, int rollNo) {
        if (root == null)
            return root;

        if (rollNo < root.data.rollNo)
            root.left = delete(root.left, rollNo);
        else if (rollNo > root.data.rollNo)
            root.right = delete(root.right, rollNo);
        else {
            // Case 1 & 2
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Case 3: Two children
            Node successor = minValueNode(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data.rollNo);
        }
        return root;
    }

    Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    // Display sorted records
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(
                "Roll No: " + root.data.rollNo +
                ", Name: " + root.data.name
            );
            inorder(root.right);
        }
    }
}
