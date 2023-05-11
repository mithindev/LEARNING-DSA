public class Basic {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 6, 232, 434};
        int target = 232;
//        int ans = Search1(arr, target);
//        System.out.println(ans);
        int ans = Search2(arr, target);
        System.out.println(ans);
    }
    static int Search1(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
    // search the target and return the element
    static int Search2(int[] arr, int target){
        if (arr.length == 0){
            return Integer.MIN_VALUE;
        }
        for (int i = 0; i < arr.length; i++){
            int element = arr[i];
            if(element == target){
                return arr[i];
            }
        }
        return Integer.MIN_VALUE;
    }
    // search the target and return true or false
    static boolean Search3(int[] arr, int target){
        if (arr.length == 0){
            return false;
        }
        for (int i = 0; i < arr.length; i++){
            int element = arr[i];
            if(element == target){
                return true;
            }
        }
        return false;
    }

}


