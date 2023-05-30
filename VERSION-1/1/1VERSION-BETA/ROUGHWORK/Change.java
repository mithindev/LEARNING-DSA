package ROUGHWORK;
import java.util.Arrays;
// change the value of array
public class Change {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] nums){
        nums[1] = 10;
    }
}
