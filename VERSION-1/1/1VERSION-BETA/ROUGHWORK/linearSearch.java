package ROUGHWORK;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 45, 6};
        int target = 45;
        int ans = LSearch(arr,target);
        System.out.println(ans);

    }
    static int LSearch(int[] arr, int target) {
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
