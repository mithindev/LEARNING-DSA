package ROUGHWORK;
import java.util.Arrays;

public class BinSort2 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        BinarySort2(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void BinarySort2 (int[] arr) {
        for (int i = 1; i < arr.length-1; i++) {
            for (int  j= 0; j < arr.length-1 ; j++) {
                if (arr[j] > arr[i]) {
                    swap(arr[j], arr[i]);
                }
            }

        }
    }
    static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;

    }
}
