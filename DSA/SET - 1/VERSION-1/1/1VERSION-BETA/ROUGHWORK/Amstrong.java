package ROUGHWORK;
import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        main(num);

    }
    static void main(int num) {
        int as = 0;
        while (num > 0) {
            int digit = num%10;
            as = as + digit * digit * digit;
            num = num/10;


        }
        if (as == num) {
            System.out.println("Amstrong");

        } else {
            System.out.println("not amstrong");
        }
    }
}
