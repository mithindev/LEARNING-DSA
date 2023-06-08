package com.Mithin.BINARY_TREE;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeRec {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(Integer val) {
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }

    Node root;
    Scanner in = new Scanner(System.in);

    Node createTree(Node root) {
        int data;
        System.out.print("Enter the value of the node: ");
        data = in.nextInt();

        if (data == -1) {
            return null;
        }

        root = new Node(data);

        System.out.println("Enter left value of " + root.data + " ");
        root.left = createTree(root.left);

        System.out.println("Enter right value of " + root.data + " ");
        root.right = createTree(root.right);

        return root;
    }

    void levelOrderTransversal () {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            if (temp == null) {
                System.out.println();
                if (!queue.isEmpty()) {
                    queue.add(null);
                }
            } else {
                System.out.print(temp.data + " ");

                if (temp.left != null) {
                    queue.add(temp.left);
                }

                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }
    }

    void printInOrder (Node node) {
        if (node == null) {
            return;
        }

        printInOrder(node.left);

        System.out.print(node.data + " --> ");

        printInOrder(node.right);
    }

    void printPreOrder (Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " --> ");

        printPreOrder(node.left);

        printPreOrder(node.right);
    }

    void printPostOrder (Node node) {
        if (node == null) {
            return;
        }
        printPostOrder(node.right);

        printPostOrder(node.left);

        System.out.print(node.data + " --> ");
    }

    // 1 2 4 -1 -1 5 -1 -1 3 -1 6 -1 -1


    public static void main(String[] args) {
        BinaryTreeRec tree = new BinaryTreeRec();
        tree.root = tree.createTree(tree.root);

        tree.printInOrder(tree.root);
    }
}
