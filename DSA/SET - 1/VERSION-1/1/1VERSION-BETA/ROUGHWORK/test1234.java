package ROUGHWORK;

import java.util.Arrays;

public class test1234 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 0};
        CycSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void CycSort (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                swap(arr, i, 0);
            }

        }
        int i = 1;
        while (i < arr.length) {
            if (arr[i] == i+1) {
                i = i+1;
            } else {
                swap(arr, i, arr[i]-1);
            }

        }
    }
    static void swap (int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

}

