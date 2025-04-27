package org.example;

public class SumOfNaturalNumbers {
    public static void main(String args[]) {
        int n = 1000;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i; // sum = sum+i
        }

        System.out.println("Sum of first " + n + " natural numbers: " + sum);

        // Print powers of 10 // Update: i *= 10; → In each iteration, i is multiplied by 10 (i = i * 10).
        for (int i = 1; i <= 100000; i *= 10) { // i = i*10;
            System.out.println(i);
        }
    }
}
