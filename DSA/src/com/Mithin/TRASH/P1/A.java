package com.Mithin.TRASH.P1;

public class A implements Runnable{
    public void run() {
        for (int i = 0; i < 250; i++) {
            System.out.println(i);
        }
    }
}
