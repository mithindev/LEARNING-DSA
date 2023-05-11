package ROUGHWORK;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        SelSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void SelSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int max = maxIndex(arr, 0, last);
            Swap(arr, max, last);
        }

    }
    static void Swap (int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
    static int maxIndex (int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
