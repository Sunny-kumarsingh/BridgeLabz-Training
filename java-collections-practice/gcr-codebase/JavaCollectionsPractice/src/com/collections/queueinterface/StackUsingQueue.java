package com.collections.queueinterface;
import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueue {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // PUSH operation
    public void push(int x) {

        //insert into q2
        q2.add(x);

        //move all elements of q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        //swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // POP operation
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return q1.remove();
    }

    // TOP operation
    public int top() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return q1.peek();
    }

    public static void main(String[] args) {

        StackUsingQueue st = new StackUsingQueue();

        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println("Pop → " + st.pop());
        System.out.println("Top → " + st.top());
    }
}
