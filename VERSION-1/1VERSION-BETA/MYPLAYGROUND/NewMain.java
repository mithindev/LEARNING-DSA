package MYPLAYGROUND;

public class NewMain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4};
        boolean ans = isSorted(arr,0);
        System.out.println(ans);

    }
    static boolean isSorted (int[] arr, int start) {
        if (start == arr.length -1) {
            return true;
        } else {
            return arr[start] < arr[start+1] && isSorted(arr, start+1);
        }
    }
}
