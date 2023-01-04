package com.example.ex;

import java.util.Random;

public class Coupons {
    public static void main(String[] args) {
        final int N = 90;
        final int NUM_OF_SIMULATIONS = 100000;
        int totalBoxes = 0;
        for (int i = 0; i < NUM_OF_SIMULATIONS; ++i) {
            totalBoxes += boxesBought(N);
        }
        double aver = totalBoxes / (double) NUM_OF_SIMULATIONS;
        System.out.println("***** N = " + N);
        System.out.println("Average : " + aver);
        System.out.println("Expected: " + N * harmo(N));
    }

    static int boxesBought(int coupons) {
        int count = 0;
        int[] boxes = new int[coupons];
        for (int i = 0; i < boxes.length; i++)
            boxes[i] = 0;
        boolean exit = true;
        Random randomBoxes = new Random();
        while (true) {
            int boxNumber = randomBoxes.nextInt(coupons) + 1;
            boxes[boxNumber - 1] = boxNumber;
            count++;
            exit = true;
            for (int i = 0; i < boxes.length; i++) {
                if (boxes[i] != i + 1)
                    exit = false;
            }
            if (exit == true)
                return count;
        }
    }

    /*static int boxesBought(int coupons) {

        boolean[] achievedCoupons = new boolean[coupons];
        int[] allCoupons = new int[coupons];
        int startCoupon = 1;

        for (int i = 0; i < coupons; i++, startCoupon++) {
            allCoupons[i] = startCoupon;
        }
        boolean loop = false;
        int count = 0;
        int countBoxes = 0;
        while (loop == false) {
            int boughtCoupon = (int) (Math.random() * coupons) + 1;
            countBoxes++;
            for (int i = 0; i < coupons; i++) {
                if (allCoupons[i] == boughtCoupon)
                    allCoupons[i] = 0;
            }
            for (int i = 0; i < coupons; i++) {
                if (allCoupons[i] == 0) {
                    achievedCoupons[i] = true;
                }
            }

            for (int i = 0; i < coupons; i++) {
                if (achievedCoupons[i] == true)
                    count++;
                if (count == coupons)
                    loop = true;
            }
            count = 0;
        }
        return countBoxes;
    }*/

    static double harmo(int n) {
        double result = 0;
        for (int i = 1; i <= n; i++)
            result = result + (double) (1 / (double) i);
        return result;
    }
}
