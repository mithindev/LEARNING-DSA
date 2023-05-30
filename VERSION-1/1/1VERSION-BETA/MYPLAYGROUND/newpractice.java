package MYPLAYGROUND;

import java.util.ArrayList;

public class newpractice {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4, 5};
        System.out.println(search(arr, 3, 0, new ArrayList<>()));
    }
    static ArrayList search(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return search(arr,target,index+1,list);
        }
}


