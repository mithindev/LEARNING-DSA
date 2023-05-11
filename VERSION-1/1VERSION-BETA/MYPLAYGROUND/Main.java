package MYPLAYGROUND;

import ROUGHWORK.LSearchNew;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4};
//        boolean ans = isSorted(arr, 0);
//        System.out.println(ans);
        boolean ans = search(arr, 8, 0);
        System.out.println(ans);
    }

    // recursive function to find weather array is sorted or not.
    static boolean isSorted (int[] arr, int start) {
        if (start == arr.length-1) {
            return true;
        } else {
            return arr[start] < arr[start+1] && isSorted(arr, start+1);
        }
    }

    static boolean search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        } else {
            return arr[index] == target || search(arr, target, index+1);
        }
    }
    
}
