package com.Mithin.TRASH;

public class Main {
    public static void main (String[] args) {
        int a=5;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e.toString());
        }
    }
}
