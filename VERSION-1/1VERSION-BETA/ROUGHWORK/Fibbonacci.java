package ROUGHWORK;
import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of terms you need :");
        int nterm = in.nextInt();
        int num1 = 0;
        int num2 = 1;
        int temp = 0;
        int count = 2;
        System.out.println(num1);
        System.out.println(num2);
        while (count<=nterm) {
            temp = num2;
            num2 = num1 + num2;
            num1 = temp;
            System.out.println(num2);
            count++;
        }

    }
}
