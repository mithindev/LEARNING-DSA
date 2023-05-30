//package com.Mithin.STACK.QUESTIONS;
//
//import java.util.Arrays;
//import java.util.Stack;
//
//public class NextGrestestElement {
//    public static void main(String[] args) {
//        long[] arr = {1, 2, 3, 4, 5};
//        long[] ans = nextLargerElement(arr, 5);
//
//        System.out.println(Arrays.toString(ans));
//
//    }
//
//    public static int[] nextLargerElement(int[] arr, int n) {
//        Stack stack = new Stack();
////        stack.firstElement() = Long.valueOf(-1);
//
//        int element;
//        int next;
//
//        stack.push(arr[0]);
//
//        for (int i = 1; i < n; i++) {
//            next = arr[i];
//
//            if (!stack.isEmpty()) {
//                element = (int) stack.pop();
//            }
//
//            while (element < next) {
//
//            }
//        }
//
//    }
//
////    static long modification (long[] arr, int s) {
////        Stack<Long> stack = new Stack<>();
////
////        for (int i = s; i < arr.length; i++) {
////
////            while (stack.size() > 0 && stack.elementAt(0) < arr[i]) {
////                stack.pop();
////            }
////            stack.push(arr[i]);
////        }
////        if (stack.isEmpty()) {
////            return -1;
////        } else {
////            return stack.peek();
////        }
////    }
//}
