package ROUGHWORK;
import java.util.Arrays;

public class CycSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 3, 1};
        System.out.println(Arrays.toString(arr));
        cSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cSort (int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correctIndex = arr[i]-1;
            if (arr[i] == arr[correctIndex]) {
                i++;
            } else {
                Swap(arr, i, correctIndex);
            }
        }
    }

    static void Swap (int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2]  = temp;
    }
}
