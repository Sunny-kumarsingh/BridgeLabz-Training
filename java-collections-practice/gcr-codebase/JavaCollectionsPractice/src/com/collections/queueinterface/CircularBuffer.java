package com.collections.queueinterface;
class CircularBuffer {
    private int[] arr;
    private int size;
    private int front = 0;
    private int rear = 0;
    private int count = 0;

    CircularBuffer(int size) {
        this.size = size;
        arr = new int[size];
    }

    // Insert element
    public void insert(int x) {

        if (count == size) {
            //overwrite oldest
            front = (front + 1) % size;
            count--;
        }

        arr[rear] = x;
        rear = (rear + 1) % size;
        count++;
    }

    // Display buffer
    public void display() {
        int i = front;
        for (int c = 0; c < count; c++) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4); 

        cb.display();  
    }
}
