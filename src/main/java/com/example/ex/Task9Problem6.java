package com.example.ex;

import java.util.Arrays;

/*Write a static function inner which takes a two-dimensional rectangular (by assumption) 
array of ints (we assume that both number of rows and number of columns are
not smaller than three). The function creates and returns a new two-dimensional
array which contains the “inner part” of the original array, i.e., without the first and
the last row and without the first and the last column. It doesn’t print anything!*/
public class Task9Problem6 {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3, 4, 5, 6, 7 },
                { 2, 3, 4, 5, 6, 7, 8 },
                { 3, 4, 5, 6, 7, 8, 9 },
                { 4, 5, 6, 7, 8, 9, 10 },
                { 4, 5, 6, 7, 8, 9, 10 } };
        for (int[] r : a)
            System.out.println(Arrays.toString(r));
        System.out.println();
        for (int[] r : inner(a))
            System.out.println(Arrays.toString(r));

    }

    public static int[][] inner(int[][] arr) {
        int[][] newArr = new int[arr.length - 2][arr[0].length - 2];

        for (int i = 1; i < arr.length - 1; i++)
            for (int j = 1; j < arr[i].length - 1; j++)
                newArr[i - 1][j - 1] = arr[i][j];

        return newArr;
    }

}
