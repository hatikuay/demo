package com.example.ex;
import java.util.Arrays;

public class Task9Problem2 {
    /*Problem 2 Write a static function which takes an array of ints and swaps (exchanges the values)
    of its greatest and smallest elements. Create a program which prints the array (in
    one line) before and after this operation.*/
    public static void main(String[] args) {
        int[] arr = { 72, 5, 6, 3, 45, 1234, 89, 12, 1, 3, 234 };
        System.out.println(Arrays.toString(arr));
        swapGreatestSmallest(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void swapGreatestSmallest(int[] arr) {

        int greatestIndex = 0;
        int smallestIndex = 0;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[greatestIndex] < arr[i]) {
                greatestIndex = i;
            }
            if (arr[smallestIndex] > arr[i]) {
                smallestIndex = i;
            }
        }
        
        int temp = arr[smallestIndex];
        arr[smallestIndex] = arr[greatestIndex];
        arr[greatestIndex] = temp;
    }    
}
