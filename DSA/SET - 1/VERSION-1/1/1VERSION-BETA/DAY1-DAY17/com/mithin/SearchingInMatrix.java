package com.mithin;
import java.util.Arrays;

// Searching in matrices (A 2D-Array);

public class SearchingInMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {18, 9,12},
                {36, -4, 91},
                {44, 33, 26}
        };
        int target = -4;
        System.out.println(Arrays.toString(LSearch(arr, target)));
    }
    static int[] LSearch(int[][] matrix, int target){
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length ; c++) {
                if(target == matrix[r][c]){
                    return new int[]{r, c};
                }
            }

        }
        return new int[]{-1, -1};
    }

}


