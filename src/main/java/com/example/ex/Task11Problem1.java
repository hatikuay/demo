package com.example.ex;

public class Task11Problem1 {
    static int count(int[] arr, int from, int what) {
        if (arr.length == from)
            return 0;
        else if (arr[from] == what)
            return count(arr, from + 1, what) + 1;
        else
            return count(arr, from + 1, what);
    }

    static int countIterative(int[] arr, int from, int what) {
        int count = 0;
        for (int i = from; i < arr.length; i++)
            if (arr[i] == what)
                count++;
        return count;
    }

    public static void main(String[] args) {
        int[] a = { 2, 3, 2, 4, 3, 1, 6, 3, 2, 3 };
        System.out.println("2 -> " + count(a, 0, 2));
        System.out.println("3 -> " + count(a, 0, 3));
        System.out.println("2 -> " + countIterative(a, 0, 2));
        System.out.println("3 -> " + countIterative(a, 0, 3));
    }
}
