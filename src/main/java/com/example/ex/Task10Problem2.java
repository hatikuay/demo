package com.example.ex;

import java.util.Arrays;

public class Task10Problem2 {

    // ...
    public static void main(String[] args) {

        int[][] a = { { 1, 2, 3, 4, 5, 6 },
                { 2, 3, 4, 5, 6, 7 },
                { 3, 4, 5, 6, 7, 8 },
                { 4, 5, 6, 7, 8, 9 } };
        for (int[] r : a)
            System.out.println(Arrays.toString(r));
        System.out.println();
        for (int[] r : trans(a))
            System.out.println(Arrays.toString(r));
    }

    public static int[][] trans(int[][] arr) {
        int[][] transpose = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                transpose[j][i] = arr[i][j];

        return transpose;

    }
}
