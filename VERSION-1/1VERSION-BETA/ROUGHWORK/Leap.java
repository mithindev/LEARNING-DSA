package ROUGHWORK;
import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if (Leap(year)) {
            System.out.println("leap year");
        } else {
            System.out.println("not a leap year");
        }
    }
    static boolean Leap(int year) {
        if (year%400 == 0) {
            return true;
        }
        if (year%100 == 0){
            return false;
        }
        if (year%4 == 0){
            return true;
        }
        return false;
    }
}
