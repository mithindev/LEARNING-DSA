package ROUGHWORK;
import java.util.Arrays;

public class L2Search {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5},
                {6, 7, 8}
        };
        int target = 8;
        int[] ans = LSearch(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] LSearch(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] {i,j};
                }

            }

        }
        return new int[] {-1,-1};
    }
}
