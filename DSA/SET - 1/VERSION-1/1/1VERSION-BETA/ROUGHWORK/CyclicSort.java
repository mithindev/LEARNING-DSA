package ROUGHWORK;
import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        CycSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void CycSort (int[] arr) {
        int i = 0;
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
