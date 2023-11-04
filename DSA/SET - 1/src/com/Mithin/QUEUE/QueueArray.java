package com.Mithin.QUEUE;

public class QueueArray {
    int[] data;
    int f = -1;
    int e = -1;

    static final int DEFAULT_SIZE = 10;


    QueueArray (int size) {
        this.data = new int[size];
    }

    QueueArray () {
        this(DEFAULT_SIZE);
    }

    boolean isEmpty() {
        return this.f == -1;
    }

    boolean isFull() {
        return this.e == data.length - 1;
    }

    boolean enQueue(int item) {
        if (isFull()) {
            System.out.println("Q Full!!");
            return false;
        }

        e++;
        data[e] = item;
        if (f == -1) {
            f = 0;
        }
        return true;
    }

    int deQueue() {
        if (isEmpty()) {
            System.out.println("Empty!");
            return -1;
        }

        int del = data[f];

        if (f == e) {
            f = -1;
            e = -1;
        } else {
            f++;
        }
        return f;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue Empty!");
            return;
        }

        System.out.print("Queue: ");
        for (int i = f; i <= e; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
