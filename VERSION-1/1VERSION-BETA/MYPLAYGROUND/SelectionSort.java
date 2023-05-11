package MYPLAYGROUND;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 7};
        System.out.println(Arrays.toString(arr));
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionsort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = MaxIndex(arr, 0, arr.length-1-i);
            int last = arr.length-1-i;
            swap(arr, maxIndex, last);
        }
    }

    static int MaxIndex (int[] arr, int s, int e) {
        int max = s;
        for (int i = s; i <= e; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}

