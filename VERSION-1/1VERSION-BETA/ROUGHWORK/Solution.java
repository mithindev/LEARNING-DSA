package ROUGHWORK;

class Solution {
    public int missingNumber(int[] nums) {
        int[] arr = {5, 3, 2, 1, 0};
        CycSort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i) {
                i++;
            }
            if (arr[arr.length-1] == arr.length) {
                i++;
            } else {
                return arr[i];
            }
        }
        return -1;
        
    }
    
    void CycSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] != arr.length && arr[i] != arr[correctIndex]) {
                Swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }
    
    void Swap(int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
     
}