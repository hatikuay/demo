package com.example.ex;

public class RotMatrix {

    static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + " ");
            System.err.println("");
        }
    }

    static void rotateMatrix(int[][] a) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            int k = a[i].length - 1;
            for (int j = 0; j < a[i].length / 2; j++) {
                temp = a[i][j];
                a[i][j] = a[i][k];
                a[i][k] = temp;
                k--;
            }
        }
        for (int j = 0; j < a[0].length; j++) {
            int k = a.length - 1;
            for (int i = 0; i < a.length / 2; i++) {
                temp = a[i][j];
                a[i][j] = a[k][j];
                a[k][j] = temp;
                k--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 7, 5, 3 },
                { 8, 6, 4, 2 } };
        int[][] b = { { 1, 2, 3, 4, 5 },
                { 5, 6, 7, 8, 9 },
                { 9, 7, 5, 3, 1 },
                { 8, 6, 4, 2, 0 },
                { 0, 4, 6, 4, 0 } };
        System.out.println("Array a - original");
        printMatrix(a);
        rotateMatrix(a);
        System.out.println("Array a - rotated");
        printMatrix(a);
        System.out.println("Array b - original");
        printMatrix(b);
        rotateMatrix(b);
        System.out.println("Array b - rotated");
        printMatrix(b);
    }
}
