package ROUGHWORK;
import java.util.Arrays;

public class Pr {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target = 37;
        System.out.println(Arrays.toString(Search(arr,target)));
    }
    static int[] Search(int[][] arr, int target) {
        int row = 0;
        int col = arr.length -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i,j};
                }
                if (arr[i][j] > target) {
                    col--;
                }
                if (arr[i][j] < target) {
                    row++;
                }

            }

        }
        return new int[]{-1,-1};
    }
}
