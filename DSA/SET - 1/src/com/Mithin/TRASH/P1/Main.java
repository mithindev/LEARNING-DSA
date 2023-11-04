package com.Mithin.TRASH.P1;

public class Main {
    public static void main(String[] args) {
        A obj = new A();

        Thread th = new Thread(obj);
        th.start();
    }
}
