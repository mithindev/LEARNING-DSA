package com.Mithin.LINKED_LIST;

public class DoubleLinkedList {

    Node head;
    int size;
    class Node {
        int data;
        Node next;
        Node prev;

        Node (int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    DoubleLinkedList () {
        this.size = 0;
        this.head = null;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void insertFirst(int data) {

        Node node = new Node(data);

        if (isEmpty()) {
            head = node;
            size++;
            return;
        }

        node.next = head;
        head.prev = node;
        head = node;
        size++;
    }

    int deleteFirst() {
        if (isEmpty()) {
            System.out.println("Empty!");
            return -1;
        }

        int del = head.data;
        head = head.next;
        return del;
    }


}
