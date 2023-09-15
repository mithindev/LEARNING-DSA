package com.mithin;
import java.util.Arrays;

public class MatrixSrotSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
    }
    static int[] BinSearch(int[][] matrix, int row, int Cstart, int Cend, int target ){

        int mid = Cstart + (Cend - Cstart)/2 ;

        while(Cstart < Cend){
            if (matrix[row-1][mid] == target){
                return new int[] {row-1, mid};
            }
            if(matrix[row-1][mid] < target){
                Cstart = mid + 1;
            } else {
                Cend = mid - 1;
            }
        }
        return new int[] {-1,-1};
    }

    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int cMid = cols/2;
        int rStart = 0;
        int rEnd = matrix.length-1;
        int rMid = rStart + (rEnd-rStart)/2;


        if(cols == 0){
            return new int[] {-1, -1};
        }
        if(rows == 1){
            return BinSearch(matrix, 0, 0, cols-1, target);
        }
        // iterating so that only two rows remains
        while(rStart < rEnd-1){
            int mid = rStart + (rEnd-rStart)/2;
            if (matrix[mid][cMid] == target){
                return new int[] {mid, cMid};
            }
            if (matrix[mid][cMid] < target){
                rStart = mid;
            } else {
                rEnd = mid;
            }
        } // now only 2 rows remain
          // now divide it into 4 sections and search in each section.
        if (matrix[rStart][cMid] == target){
            return new int[] {rStart, cMid};
        }
        if (matrix[rStart+1][cMid] == target){
            return new int[] {rStart + 1, cMid};
        }
        if (matrix[rStart][cMid] > target){
            return BinSearch(matrix, rStart, 0, cMid-1, target);
        }
        if (matrix[rStart][cMid] < target){
            return BinSearch(matrix, rStart, cMid +1, cols, target);
        }
        if (matrix[rStart+1][cMid] > target){
            return BinSearch(matrix, rStart+1, 0, cMid-1, target);
        }
        if (matrix[rStart+1][cMid] < target){
            return BinSearch(matrix, rStart+1, cMid+1, cols, target);
        }
        return new int[] {-1, -1};
    }
}























