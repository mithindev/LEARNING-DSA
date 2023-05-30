package DAY30;

public class RecBS {
    public static void main(String[] args) {

    }

    static void BS(int[] arr, int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[col+1]) {
                int temp = arr[col+1];
                arr[col+1] = arr[col];
                arr[col] = temp;
            }
            BS(arr, row, col+1);
        } else {
            BS(arr, row-1, 0);
        }
    }

}
