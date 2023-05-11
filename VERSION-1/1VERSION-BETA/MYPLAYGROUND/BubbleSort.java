package MYPLAYGROUND;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 7};
        System.out.println(Arrays.toString(arr));
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubblesort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j-1] > arr[j] ) {
//                    swap(arr[j-1], arr[j]);
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }

        }
    }

    static void swap(int num1, int num2) {
        int temp = num2;
        num2 = num1;
        num1 = temp;
    }
}
