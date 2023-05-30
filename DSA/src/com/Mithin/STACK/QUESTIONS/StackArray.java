package com.Mithin.STACK.QUESTIONS;

public class StackArray {
    static final int DEFAULT_SIZE = 10;
    protected int[] data;
    int ptr = -1;

    StackArray(int size) {
        this.data = new int[size];

    }

    StackArray () {
        this(DEFAULT_SIZE);
    }

    boolean isEmpty() {
        return ptr == -1;
    }

    boolean isFull() {
        return ptr == data.length;
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Error!! Stack is full");
            return false;
        }
        data[++ptr] = item;
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack id Empty");
            return 0;
        }
        int del = data[ptr];
        ptr--;
        return del;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Empty Stack!");
        } else {
            System.out.println(data[ptr]);
        }
    }

    public void display() {
        for (int i = ptr; i >= 0; i--) {
            System.out.print(" " + data[i]);
        }
        System.out.println();
    }
}
