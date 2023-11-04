package com.Mithin.QUEUE;

import java.util.Stack;

public class QueueUsingStack {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    static void enQueue (int data) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        s1.push(data);

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    static int deQueue() {
        if (s1.isEmpty()) {
            System.out.println("Empty!!");
            System.exit(0);
        }
        return s1.pop();
    }
}
