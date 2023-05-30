public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 3434, 546, 6778, 32,45546};
        int ans = MinValue(arr);
        System.out.println(ans);

    }
    static int MinValue(int[] arr){
       // Assume arr.length != 0
        int temp = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < temp){
                temp = arr[i];
            }

        }
        return temp;
    }
    static int MaxValue(int[] arr){
        // Assume arr.length != 0
        int temp = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > temp){
                temp = arr[i];
            }

        }
        return temp;
    }

}
