package com.Mithin.QUEUE;

public class CircularQueueArray {
    private int[] data;
    int f;
    int e;
    int count;
    static final int DEFAULT_SIZE = 10;

    public CircularQueueArray(int size) {
        this.data = new int[size];
        this.f = -1;
        this.e = -1;
        this.count = 0;
    }

    public CircularQueueArray() {
        this(DEFAULT_SIZE);
    }

    boolean isFull() {
        return count == data.length;
    }

    boolean isEmpty() {
        return count == 0;
    }

    boolean enQueue (int item) {
        if (isFull()) {
            System.out.println("OverFlow!!");
            return false;
        }

        count++;
        e = (e + 1) % data.length;
        data[e] = item;
        if (f == -1) {
            f = 0;
        }
        return true;
    }

    int deQueue() {
        if (isEmpty()) {
            System.out.println("UnderFlow!!");
            return -1;
        }

        int del = data[f];

        if (f == e) {
            f = -1;
            e = -1;
        } else {
            f = (f + 1) % data.length;
        }
        count--;
        return del;

    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!!");
            return;
        }

        int i = f;
        while (true) {
            System.out.println(data[i] + ", ");

            if (i == e) {
                break;
            }
            i = (i + 1)%data.length;
        }
        System.out.println();
    }
}
