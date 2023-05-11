package ROUGHWORK;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        Input Integers
        System.out.println("please enter some number :");
        int rollno = input.nextInt();
        System.out.println("your roll no is :" + rollno);

//        Input Strings
        String name = input.next();
        System.out.println(name);

//        Input floats
        float marks = input.nextFloat();
        System.out.println(marks);

    }
}
