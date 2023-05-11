package DAY30;

public class pattern1 {
    public static void main(String[] args) {
        pattern2(4, 0);
    }
    static void pattern1(int row, int col) {
        if (row < 1) {
            return;
        }
        if (col < row) {
            System.out.print(" * ");
            pattern1(row,col+1);
        } else {
            System.out.println();
            pattern1(row-1,0);
        }
    }

    static void pattern2(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            pattern2(row,col+1);
            System.out.print(" * ");
        } else {
            pattern2(row-1,0);
            System.out.println();

        }
    }
}
