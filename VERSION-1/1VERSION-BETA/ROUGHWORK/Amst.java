// Print all the amstrong number between 1 and 1000.


import java.util.Scanner;

public class Amst {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            if (isAmstrong(i)) {
                System.out.println(i);
            }
        }
    }
    static boolean isAmstrong(int num) {
        int original = num;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num/10;
            sum = sum + rem*rem*rem;
        }
        return (sum == original);
    }
}
