public class SearchInRange {
    public static void main(String[] args) {

    }
    static int Search1(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }
        for (int i = start; i < end+1; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }

}
