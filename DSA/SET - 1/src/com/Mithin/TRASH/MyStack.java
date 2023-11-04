//package com.Mithin.TRASH;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//class MyStack {
//    Queue<Integer> queue = new LinkedList<Integer>();
//    Queue<Integer> queueHelp = new LinkedList<Integer>();
//
//    public void push(int x) {
//        queueHelp.add(x);
//        while (!queue.isEmpty()) {
//            queueHelp.add(queue.poll()));
//        }
//
//        Queue<Integer> temp = queueHelp;
//        queueHelp = queue;
//        queue = temp;
//    }
//
//    public int pop() {
//        return queue.poll();
//    }
//
//    public int top() {
//        return queue.peek();
//    }
//
//    public boolean empty() {
//        return queue.isEmpty();
//    }
//}
//
///**
// * Your MyStack object will be instantiated and called as such:
// * MyStack obj = new MyStack();
// * obj.push(x);
// * int param_2 = obj.pop();
// * int param_3 = obj.top();

// */