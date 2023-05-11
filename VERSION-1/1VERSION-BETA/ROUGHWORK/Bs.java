package ROUGHWORK;

public class Bs {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 45, 5};
        int target = 45;
        int ans = BinSearch(arr, target);
        System.out.println(ans);
    }

    static int BinSearch (int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length-1;
        int mid = start + (end-start)/2;

        while (start<end) {
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                end = start - 1;
            }

            if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
