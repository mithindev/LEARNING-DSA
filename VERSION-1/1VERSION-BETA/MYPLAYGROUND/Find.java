package MYPLAYGROUND;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int ans = Search(arr,5,0);
        System.out.println(ans);
    }
    static int Search (int[] arr,int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }  else {
            return Search(arr, target, index+1);
        }
    }
//    return the array if indices where ever the target is present
    static ArrayList<Integer> FindAllIndex (int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return FindAllIndex(arr, target, index+1, list);
    }
    // the array list is in the function parameter.

    static ArrayList<Integer> list = new ArrayList<>();
    static void FindAllIndex1(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        FindAllIndex1(arr, target, index+1);
    }




    // An VERY IMPORTANT TYPE!!!

    static ArrayList<Integer> FindAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelow = FindAllIndex2(arr, target, index + 1);

        list.addAll(ansFromBelow);

        return list;

    }
}
