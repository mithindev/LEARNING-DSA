package ROUGHWORK;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {34, 6, 2, 7, 4, 1, 87};
        BubSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void BubSort(int[] arr) {
        boolean ifSorted = false;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < (arr.length-i-1); j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    ifSorted = true;
                }
            }
            if (!ifSorted) {
                break;
            }

        }

    }
}
