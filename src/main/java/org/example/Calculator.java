package org.example;

public class Calculator {
    public static void main(String[] args) {
        addNumbers(5, 3);
        int sum = add(5, 3);
        System.out.println("Sum: " + sum);
        int output = square(3);
        System.out.println("Square of the number is: " + output);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void addNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    public static int square(int num) {
        return num * num;
    }

}
