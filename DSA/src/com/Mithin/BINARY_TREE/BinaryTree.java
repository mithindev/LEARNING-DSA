package com.Mithin.BINARY_TREE;

public class BinaryTree {

    class Node {
        int data;
        Node left;
        Node right;

        Node (int val) {
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    BinaryTree (int data) {
        root = new Node (data);
    }

    BinaryTree () {
        root = null;
    }

    void insert (int data) {
        Node node = new Node (data);

        if (root == null) {
            root = node;
        } else {
            Node temp = root;
            while (true) {
                if (temp.left == null) {
                    temp.left = node;
                    break;
                } else if (temp.right == null) {
                    temp.right = node;
                    break;
                } else {
                    temp = temp.left;
                }
            }
        }
    }
}
