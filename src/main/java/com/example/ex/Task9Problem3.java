package com.example.ex;

public class Task9Problem3 {
    /*
     * printArr: takes an array and prints, in square brackets, its elements in one
     * line, separated with spaces;
     * numOdd: takes an array and returns the number of its odd elements;
     * numEven: takes an array and returns the number of its even elements;
     * getOddEven: takes an array and creates two (possibly empty) arrays — one
     * containing only the odd elements of the input array and one containing only
     * its even elements — and returns a two-element array containing the references
     * to
     * these two arrays;
     * getMinMaxInd: takes an array and returns a two-element array containing the
     * indices of the minimum and maximum elements.
     */
    public static void main(String[] args) {
        int[] a = { -1, 9, 3, 0, -3, 2, 4 };
        System.out.print("array: ");
        printArr(a);
        System.out.println(" odd: " + numOdd(a));
        System.out.println("even: " + numEven(a));
        int[] indMinMax = getMinMaxInd(a);
        System.out.println("Index of min: " + indMinMax[0]);
        System.out.println("Index of max: " + indMinMax[1]);
        int[][] res = getOddEven(a);
        System.out.print("odd elements: ");
        printArr(res[0]);
        System.out.print("even elements: ");
        printArr(res[1]);

    }

    public static void printArr(int[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length - 1; i++) {
            result = result + String.valueOf(arr[i]) + ", ";
        }
        result = result + String.valueOf(arr[arr.length - 1]) + "]";
        System.out.println(result);
    }

    public static int numOdd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1 || arr[i] % 2 == -1)
                count++;
        }
        return count;
    }

    public static int numEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                count++;
        }
        return count;
    }

    public static int[][] getOddEven(int[] arr) {
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                countEven++;
            else
                countOdd++;
        }
        int[][] oddEven = new int[2][];
        oddEven[0] = new int[countOdd];
        oddEven[1] = new int[countEven];
        countEven = 0;
        countOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                oddEven[1][countEven] = arr[i];
                countEven++;
            } else {
                oddEven[0][countOdd] = arr[i];
                countOdd++;
            }
        }
        return oddEven;
    }

    public static int[] getMinMaxInd(int[] arr) {

        int[] minMaxIndex = { 0, 0 };

        for (int i = 1; i < arr.length; i++) {
            if (arr[minMaxIndex[1]] < arr[i]) {
                minMaxIndex[1] = i;
            }
            if (arr[minMaxIndex[0]] > arr[i]) {
                minMaxIndex[0] = i;
            }
        }
        return minMaxIndex;
    }
}
