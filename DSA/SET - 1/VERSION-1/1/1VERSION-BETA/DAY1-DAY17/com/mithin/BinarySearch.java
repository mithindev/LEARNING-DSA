package com.mithin;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 36;
        int ans = BinarySh(arr, target);
        System.out.println(ans);

    }
    static int BinarySh(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
//        int mid = start + (end-start)/2;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(target > arr[mid]){
                start = mid + 1;
                if(arr[mid] == target){
                    return mid;
                }
            }
            else{
                end = mid-1;
                if (target == arr[mid]){
                    return mid;
                }
            }
        }
        return -1;
    }

}
