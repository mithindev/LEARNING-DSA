package com.Mithin.ARRAYS.LinearSearch;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr = {5, 15, 6, 9, 4};
        System.out.println(LS(arr, 90, 0));
    }

    static  int LS (int[] arr, int target, int s) {
        if (s == arr.length) {
            return -1;
        }
        if (arr[s] == target) {
            return s;
        }
        return LS(arr, target, s+1);
    }
}
