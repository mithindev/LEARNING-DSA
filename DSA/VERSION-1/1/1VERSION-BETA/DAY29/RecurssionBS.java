package DAY29;

public class RecurssionBS {
    public static void main(String[] args) {

    }
    static boolean BS1 (int[] arr, int target, int index) {
        if (index == arr.length - 1) {
            return false;
        } else {
            return arr[index] == target || BS1(arr, target, index+1);
        }
    }

    static int BS2 (int[] arr, int target, int index) {
        if (index == arr.length - 1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return BS2(arr, target, index+1);
        }

    }
}
