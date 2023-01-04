package com.example.ex;

public class recursive {
    static int fibo(int n) {
        if (n < 0)
            throw new IllegalArgumentException();
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        for (int num = 0; num <= 12; ++num)
            System.out.println("Factorial of " + num + " is " + fibo(num));
    }

}
