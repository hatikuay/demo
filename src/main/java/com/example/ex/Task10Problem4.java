package com.example.ex;

public class Task10Problem4 {
    public static void main(String[] args) {
        int[][] a = {
                { 4, 9, 10, 0, 1, 2 },
                { 7, -8, 20, 1, 5, 8 },
                { 1, 8, 3, 2, 1, -3 },
                { 1, 8, -3, 2, 11, -3 },
                { 17, 0, 5, -9, 21, 10 }
        };
        printArr(a, "Original matrix");
        setZeros(a);
        System.out.println();
        printArr(a, "Zeroing rows and columns containing zero");
    }

    public static void setZeros(int[][] arr) {
        int[][] tmpArr = new int[arr.length][];
        for (int i = 0; i < arr.length; i++)
            tmpArr[i] = new int[arr[i].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                tmpArr[i][j] = arr[i][j];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
            {
                if(arr[i][j]==0){
                    for (int k = 0; k < arr[i].length; k++)
                        tmpArr[i][k] = 0;
                    for (int k = 0; k < arr.length; k++)
                        tmpArr[k][j] = 0;
                }
            }                
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = tmpArr[i][j];
        }

        // ...
    }

    public static void printArr(int[][] arr, String message) {
        System.out.println(message);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(String.valueOf(arr[i][j] + "\t"));
            System.out.println();
        }
    }

}
