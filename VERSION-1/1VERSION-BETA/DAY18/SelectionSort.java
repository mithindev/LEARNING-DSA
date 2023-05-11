package DAY18;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length -1 -i;
            int start = 0;
            int max = maxIndex(arr, start, last);
            swap(arr, max, last);
        }

    }
    static void swap(int[] arr, int max, int last){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }
    static int maxIndex(int[] arr ,int start, int end){
        int max = 0;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}


