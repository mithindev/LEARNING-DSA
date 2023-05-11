package ROUGHWORK;
// This is nothing but catagorasing the normal Binary Searching into ascending and Descending order type!

public class OrderAgnoBS {
    public static void main(String[] args) {

    }
    static int OrderABS (int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        boolean isAss = arr[start] < arr[end];

        while (start<= end) {
            int mid = start + (end-start)/2;
            if (arr[mid] == target) {
                return -1;
            }
            if (isAss) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }else {
                if (target > arr[mid]) {
                    start = mid - 1;
                } else {
                    end = mid + 1;
                }
            }
        }
        return -1;
    }
}
