package ROUGHWORK;
import java.util.Scanner;
// write a function to find weather the given number is prime or not:=
public class Prime2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number you wanna check :");
        int num = in.nextInt();
        String ans = prime(num);
        System.out.println(ans);

    }
    static String prime (int num) {
        int f = 2;
        while (f*f <= num) {
            if (num%f == 0){

                return "not prime";
            }
            f++;
        }
        return "prime";
    }
}
