package com.bst.universitydigitalrecordsystem;


class Node {
    Student data;
    Node left, right;

    Node(Student data) {
        this.data = data;
        left = right = null;
    }
}
