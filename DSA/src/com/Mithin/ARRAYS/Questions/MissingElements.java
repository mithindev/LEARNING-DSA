package com.Mithin.ARRAYS.Questions;

import java.util.Arrays;

public class MissingElements {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(missingNumber(arr, 2));
    }

    static int missingNumber(int array[], int n) {
        Arrays.sort(array);

        for (int i = 0; i < n; i++) {
            if(i < array.length && array[i] != i + 1) {
                return i+1;
            }
        }
        return n;
    }
}
