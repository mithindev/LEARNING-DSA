package DAY29;

import java.util.Arrays;
import java.util.ArrayList;


//practicing with LinkedList
// getting familiar with linked lists.

public class TryingWithLinkedList {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};
//        boolean ans = search(arr,4,0);
//        System.out.println(ans);
        FindAllIndex(arr, 4, 0);
        System.out.println(list);

    }
    static boolean search (int[] arr, int target, int index) {
        if (index == arr.length - 1) {
            return false;
        } else {
            return arr[index] < arr[index + 1] || search(arr, target, index+1);
        }
    }

    static int IndexSearch (int[] arr, int target, int index) {
        if (index == arr.length-1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return IndexSearch(arr, target, index+1);
        }
    }

    // declaring a linked List.
    static ArrayList<Integer> list = new ArrayList<>();
    static void FindAllIndex (int[] arr, int target, int index) {
        if (index == arr.length ) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        FindAllIndex(arr, target, index + 1);
    }

    //passing linked list as a parameter

    static ArrayList<Integer> FindAllIndex (int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return FindAllIndex(arr, target, index+1, list);

    }

    static ArrayList<Integer> FindAllIndex2 (int[] arr, int target, int index) {
        ArrayList<Integer> list= new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> temp = FindAllIndex2(arr, target, index+1);

        list.addAll(temp);

        return list;
    }
}
