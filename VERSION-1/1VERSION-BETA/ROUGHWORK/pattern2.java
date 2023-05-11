package ROUGHWORK;
public class pattern2 {
    public static void main(String[] args) {
        pattern2(5);
    }
    static void pattern2 (int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
