package com.Mithin.STACK;

import java.util.Stack;

public class StackArray {
    public static void main(String[] args) {
        String str = "Mithin";
        reverse(str);


    }

    static void reverse (String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        while (!stack.isEmpty()) {
            System.out.print(" " + stack.pop());
        }
    }
}
