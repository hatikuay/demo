package com.example.ex;

import java.util.Arrays;

public class Task9Problem5 {
    public static void main(String[] args) {
        int[][][] opers = {
                { { 100, -50, 25 }, { 150, -300 }, { 300, -90, 100 } },
                { { 90, -60, 250 }, { 300, 20, -100 } },
                { { 20, 50 }, { 300 }, { 20, -20, 40 }, { 100, -200 } }
        };

        //int subSum = 0;
        /*The program should create an array of ints of dimension equal to the number of
        customers, the elements of which are sums of all deposits and withdrawals for subsequent customers, in and out of all his/her accounts (for the data as in the example
        above, these should be the numbers 235, 500 and 310).*/
        int arr[] = new int[opers.length];
        
        for (int i = 0; i < opers.length; i++) {
            arr[i] = 0;
            for (int j = 0; j < opers[i].length; j++) {
                for (int k = 0; k < opers[i][j].length; k++) {
                    arr[i] = arr[i] + opers[i][j][k];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
