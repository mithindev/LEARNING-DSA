package DAY30;

public class SelSortRecursion {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
    }
    static void selSort(int[] arr, int c, int r, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                selSort(arr, c+1, r, c);
            } else {
                selSort(arr,c+1,r,max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selSort(arr, r-1, 0, 0);
        }
    }
}
