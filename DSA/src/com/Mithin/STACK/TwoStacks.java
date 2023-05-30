package com.Mithin.STACK;

public class TwoStacks {
    int size1;
    int size2;

    int top1;
    int top2;

    static final int DEFAULT_SIZE_1 = 5;
    static final int DEFAULT_SIZE_2 = 5;
    int[] data;

    TwoStacks (int size1, int size2) {
        this.size1 = size1;
        this.size2 = size2;
        this.data = new int[size1 + size2];
        this.top1 = -1;
        this.top2 = size1 - 1;
    }

    TwoStacks () {
        this (DEFAULT_SIZE_1, DEFAULT_SIZE_2);
    }

    boolean isFull1() {
        return top1 == size1 - 1;
    }

    boolean isFull2() {
        return top2 == data.length - 1;
    }

    boolean isEmpty1() {
        return top1 == -1;
    }

    boolean isEmpty2() {
        return top2 == data.length/2 - 1;
    }

    void push1(int item) {
        if (isFull1()) {
            System.out.println("Stack1 is Full!!");
            return;
        } else {
            top1++;
            data[top1] = item;
        }
    }

    void push2(int item) {
        if (isFull1()) {
            System.out.println("Stack1 is Full!!");
            return;
        } else {
            top2++;
            data[top2] = item;
        }
    }

    int pop1() {
        if (isEmpty1()) {
            System.out.println("Empty stack 1!!");
            System.exit(0);
        } else {
            int del = data[top1];
            top1--;
            return del;
        }
        return 0;
    }

    int pop2() {
        if (isEmpty1()) {
            System.out.println("Empty stack 1!!");
            System.exit(0);
        } else {
            int del = data[top2];
            top2--;
            return del;
        }
        return 0;
    }
}
