package ROUGHWORK;
import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int count = 0;
        while (num1 > 0) {
            int digit = num1% 10;
            if (digit == num2) {
                count++;
            }
            num1 = num1/10;
        }
        System.out.println(count);
    }
}
