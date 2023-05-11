package com.Mithin.ARRAYS.BinarySearch;

public class Max {
    public static void main(String[] args) {
        System.out.println(max(2, 4, 10));
    }

    static int max(int a, int b, int c) {
        int ans = Integer.MIN_VALUE;
        if (a > b && a > c) {
            ans = a;
        } else if (b > c) {
            ans = b;
        } else {
            ans = c;
        }
        return ans;
    }
}
