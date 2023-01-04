package com.example.ex;

import java.util.Arrays;

public class Task10Problem3 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 3, 2 }, 
                        { 3, 4, 8 }, 
                        { 2, 6, 8 }, 
                        { 1, 8, 5 } };
        System.out.println(Arrays.toString(maxRowColumnIndex(arr)));
    }

    public static int[] maxRowColumnIndex(int[][] arr) {
        int[] arrMaxRowColumnIndex = new int[2];
        int[] row = new int[arr.length];
        int[] column = new int[arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                row[i] = row[i] + arr[i][j];
            }
        }

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                column[i] = column[i] + arr[j][i];
            }
        }

        arrMaxRowColumnIndex[0] = maxIndex(row);
        arrMaxRowColumnIndex[1] = maxIndex(column);
        return arrMaxRowColumnIndex;
    }

    public static int maxIndex(int[] arr) {
        int maxIndex = 0;
        int max = arr[maxIndex];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
