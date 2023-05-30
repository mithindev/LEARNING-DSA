package ROUGHWORK;
import java.util.Arrays;
// Search in a sorted matrix


public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {6, 7, 8, 9},
                {10, 11, 12, 13},
                {14, 15, 16, 17}
        };
        int target = 1;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int[] BS(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd){
            int mid = cStart + (cEnd-cStart)/2;
            if (matrix[row][mid] == target) {
                return new int[]{row,mid};
            }
            if (matrix[row][mid] < target){
                cStart = mid+1;
            } else {
                cEnd = mid-1;
            }
        }
        return new int[]{-1,-1};
    }


    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
            BS(matrix, 0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows-1;
        int cMid = rStart + (rEnd-rStart)/2;

        // run the loop until only two rows remaining

        while (rStart < (rEnd-1)) {
            int rMid = rStart + (rEnd-rStart)/2;

            if (matrix[rMid][cMid] == target) {
                return new int[]{rMid,cMid};
            }
            if (matrix[rMid][cMid] < target) {
                rStart = rMid;
            }
            if (matrix[rMid][cMid] > target) {
                rEnd = rMid;
            }
        }
        // now we have only two rows
        // check wether the target is int col (mid col)
        if (matrix[rStart+1][cMid] == target) {
            return new int[]{rStart+1,cMid};
        }
        if (matrix[rEnd+1][cMid] == target) {
            return new int[]{rEnd+1, cMid};
        }
        if (target <= matrix[rStart+1][cMid-1]) {
            return BS(matrix, rStart,0,  cMid-1, target );
        }
        if (target >= matrix[rStart+1][cMid-1]) {
            return BS(matrix, 0, cMid+1, matrix[0].length-1, target);
        }
        if (target < matrix[rEnd][cMid+1]) {
            return BS(matrix, rStart+1,0,  cMid-1, target );
        } else {
            return BS(matrix, 1, cMid+1, matrix[1].length-1, target);
        }
    }
}
