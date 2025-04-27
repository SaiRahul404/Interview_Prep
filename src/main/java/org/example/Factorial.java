package org.example;

public class Factorial {
    // 5! = 5*4*3*2*1
    // 10! =
    public static void main(String args[]) {
        int n = 15;
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i; // factorial = factorial*i
        }

        System.out.println(n + "! = " + factorial);
    }
}
