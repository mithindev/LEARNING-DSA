package ROUGHWORK;

public class LSearchNew {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int ans = LS(arr, 5);
        System.out.println(ans);

    }

    static int LS (int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
