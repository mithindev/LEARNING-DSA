package ROUGHWORK;
//import java.util.Arrays;

public class Min {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,66, 7};
        System.out.println(Min(arr));
    }

    static int Min(int[] arr) {
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

}
