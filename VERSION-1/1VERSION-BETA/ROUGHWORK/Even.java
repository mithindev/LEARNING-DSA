package ROUGHWORK;

public class Even {
    public static void main(String[] args) {
        int[] arr = {12, 34, 456, 67, 789,9999};
        int ans = count (arr);
        System.out.println(ans);

    }
    static int count (int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (even(arr[i])) {
                count ++;
            }

        }
        return count;

    }
    static boolean even (int num) {
        int count = 0;
        while (num > 0) {
            num = num/10;
            count++;
        }
        if (count%2 == 0){
            return true;
        }
        return false;
    }

}

