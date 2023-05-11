package com.Mithin.ARRAYS.BinarySearch;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 10, 40 };
        System.out.println(RecBS(arr, 40, 0, arr.length - 1));
    }

    static int RecBS(int[] arr, int target, int s, int e) {
        int mid = s + (e - s)/2;

        if (arr[mid] == target) {
            return mid;
        }
        if (target > mid) {
            return RecBS(arr, target, mid + 1, e);
        }
        if (target < mid) {
            return RecBS(arr, target, s, mid - 1);
        }

        return -1;

    }
}
