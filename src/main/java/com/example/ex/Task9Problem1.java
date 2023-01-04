package com.example.ex;

public class Task9Problem1 {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 6, 3, 45, 67, 89, 12, 1, 3, 234 };
        System.out.println(differenceBetweenIndex(arr));
    }
    
    public static int differenceBetweenIndex(int[] arr) {

        int firstEvenIndex = -1;
        int lastEvenIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                firstEvenIndex = i;
                break;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                lastEvenIndex = i;
                break;
            }
        }
        if (firstEvenIndex == lastEvenIndex)
            return -1;
        return lastEvenIndex - firstEvenIndex;
    }

}
