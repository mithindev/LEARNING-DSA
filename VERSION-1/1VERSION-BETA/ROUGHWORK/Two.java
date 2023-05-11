package ROUGHWORK;

import java.util.Scanner;

//Hmmm... Input a number and write the code to find weather the given number is prime
//or not

//public class Two {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Please enter a number: ");
//        int num = in.nextInt();
//
//        int i = 2;
//        while (i < num) {
//            if (num / i == 1) {
//                System.out.println("not prime");
//                return;
//            }
//            else i++;
//
//        }

//        for (int i = 2; i < num; i++) {
//            if (num / i == 1) {
//                System.out.println("not prime");
//            }
//            else {
//                System.out.println("prime");
//            }
//        }
//
//
//    }
//}


public class Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("please enter a number :");
        int num = in.nextInt();
        if(num <= 1) {
            System.out.println("neither prime nor composite");
            return;
        }
        int c = 2;
        while (c * c <= num);
    }
}






