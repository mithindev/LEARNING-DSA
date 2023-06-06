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

//    void levelOrderTransversal() {
//        Queue<Node> queue = new LinkedList<Node>();
//        queue.add(root);
//
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                Node temp = queue.poll();
//                System.out.print(temp.data + " ");
//
//                if (temp.left != null) {
//                    queue.add(temp.left);
//                }
//
//                if (temp.right != null) {
//                    queue.add(temp.right);
//                }
//            }
//            System.out.println();
//        }
//    }


    public static void main(String[] args) {
        BinaryTreeRec tree = new BinaryTreeRec();
        tree.root = tree.createTree(tree.root);

        System.out.println("Level order traversal of binary tree is - ");
        tree.levelOrderTransversal();
    }
}
