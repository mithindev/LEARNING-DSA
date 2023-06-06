package com.Mithin.DSA_ASSIGNMENT_2;

public class DeQueueCustom {
    int front;
    int rear;
    int count;
    int[] data;

    int size;

    static final int DEFAULT_SIZE = 10;

    DeQueueCustom(int size) {
        this.data = new int[size];
        this.front = -1;
        this.rear = -1;
        this.count = 0;
        this.size = size;
    }

    DeQueueCustom() {
        this(DEFAULT_SIZE);
    }
    boolean isEmpty() {
//        return front == -1 && rear == -1;
        return count == 0;
    }

    boolean isFull() {
//        return (rear + 1) % data.length == front;
        return count == size;
    }

    void Insert_from_theRearEnd(int item) {
        if (isFull()) {
            System.out.println("Queue is full!!");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % size;
        count++;
        data[rear] = item;
    }

    void delete_From_theFrontEnd() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!!");
            return;
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
        count--;
    }




    void Insert_from_theFrontEnd (int item) {
        if (isFull()) {
            System.out.println("Queue is full!!");
            return;
        }

        if (front == 0) {
            front = size - 1;
        } else {
            front = front - 1;
        }
        data[front] = item;
        count++;
    }

    void delete_From_theRearEnd () {
        if (isEmpty()) {
            System.out.println("Queue is Empty!!");
            return;
        }

        if (rear == 0) {
            rear = size - 1;
        } else {
            rear = rear - 1;
        }
        count --;
    }

    void peek_frontEnd() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!!");
            return;
        }

        System.out.println(data[front]);
    }

    void peek_rearEnd() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!!");
            return;
        }

        System.out.println(data[rear]);
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!!");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " | ");
            i = (i + 1) % size;
        } while (i != (rear + 1) % size);
    }

    public static void main(String[] args) {
        DeQueueCustom queue = new DeQueueCustom(5);

//        queue.delete_From_theFrontEnd();
        queue.Insert_from_theRearEnd(1);
//        queue.Insert_from_theRearEnd(2);
//        queue.Insert_from_theRearEnd(3);
//        queue.Insert_from_theRearEnd(4);
//        queue.Insert_from_theRearEnd(5);

        queue.Insert_from_theFrontEnd(10);
        queue.Insert_from_theFrontEnd(11);

        System.out.println(queue.front);

//        queue.delete_From_theRearEnd();
//
//        queue.delete_From_theFrontEnd();

        queue.peek_frontEnd();
        queue.peek_rearEnd();

        queue.display();
    }

}
