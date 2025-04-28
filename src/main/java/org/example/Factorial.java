package org.example;
import java.util.Scanner;

public class Factorial {
    // 5! = 5*4*3*2*1
    // 10! =
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you Value: ");
        int n = sc.nextInt();
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i; // factorial = factorial*i
        }

        System.out.println(n + "! = " + factorial);
    }
}
