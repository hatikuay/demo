package com.example.ex;

import java.util.Arrays;

public class FuncStat {
    public static int fiboR(int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;
        return fiboR(n - 1) + fiboR(n - 2);
    }

    public static int fiboI(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 1; i <= n + 1; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        return c;
    }

    public static int factR(int n) {
        if (n == 0)
            return 1;
        return n * factR(n - 1);

    }

    public static int factI(int n) {
        if (n == 0)
            return 1;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    /*
     * If a = 0, then GCD (a, b) = b as GCD (0, b) = b.
     * If b = 0, then GCD (a, b) = a as GCD (a, 0) = a.
     * If both a≠0 and b≠0, we write 'a' in quotient remainder form (a = b×q + r)
     * where q is the quotient and r is the remainder, and a>b.
     * Find the GCD (b, r) as GCD (b, r) = GCD (a, b)
     * We repeat this process until we get the remainder as 0.
     */
    public static int gcdR(int a, int b) {
        if (b == 0)
            return a;
        return gcdR(b, a % b);
    }

    public static int gcdI(int a, int b) {
        int temp = 0;
        while (true) {
            temp = b;
            b = a % b;
            a = temp;
            if (b == 0)
                return a;
        }        
    }

    public static int maxElem(int[] arr, int from) {
        if (arr.length - 1 == from)
            return arr[from];
        int next = maxElem(arr, from + 1);
        if (arr[from] > next)
            return arr[from];
        else
            return next;
    }

    public static int numEven(int[] arr, int from) {
        if (arr.length - 1 == from) {
            if (arr[from] % 2 == 0)
                return 1;
            else
                return 0;
        }
        if (arr[from] % 2 == 0)
            return 1 + numEven(arr, from + 1);
        else
            return 0 + numEven(arr, from + 1);
    }

    public static void reverse(int[] arr, int from) {
        int temp = 0;
        temp = arr[arr.length - 1 - from];
        arr[arr.length - 1 - from] = arr[from];
        arr[from] = temp;
        if (arr.length / 2 - 1 == from)
            return;
        reverse(arr, from + 1);
    }

    public static boolean isPalindrom(String s) {
        char[] S;
        S = s.toCharArray();
        if (S[S.length - 1] != S[0])
            return false;
        if (S.length / 2 == 1)
            return true;
        char[] S2 = Arrays.copyOfRange(S, 1, S.length - 1);
        s = String.valueOf(S2);
        return isPalindrom(s);
    }
}
