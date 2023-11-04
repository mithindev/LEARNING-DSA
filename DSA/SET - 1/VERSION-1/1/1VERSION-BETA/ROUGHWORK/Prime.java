package ROUGHWORK;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a number :");
        int num = in.nextInt();

        // (N/2) method

//        ''' concept: the factors of a number is alwaysless than or equal to
//        (number/2) '''


//        int count = 1;
//        for (int i = 2; i < num/2; i ++ ) {
//            if (num % i == 0) {
//                System.out.println("not prime");
//                count++;
//                return;
//            }
//            else {
//                i++;
//            }
//        }
//        if (count == 1) {
//            System.out.println("Prime");
//        }

        // Square root method

//        ''' concept: when a number is resolverd into the factors of two, the smaller one is
//            always less than or equal to root(number)

        int f = 2;
        if (num < 1) {
            System.out.println("Neither prime nor composite");
        }
        while (f * f < num) {
            if (num % f == 0) {
                System.out.println("not prime");
                return;
            }
            else {
                f++;
            }
        }
        if (f * f > num){
            System.out.println("prime");
        }

    }
}
