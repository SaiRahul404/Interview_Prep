package org.example;

public class CharExample {
    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = 66; // Unicode for 'B'

        System.out.println("ch1: " + ch1); // A
        System.out.println("ch2: " + ch2); // B

        char hindiChar = '\u0939';  // Unicode for 'ह'
        char emoji = '\u2764';      // Unicode for '❤'

        System.out.println("Hindi character: " + hindiChar);
        System.out.println("Heart emoji: " + emoji);

        byte small = 127;
        short medium = 32000;
        int large = 200000;
        long veryLarge = 5000000000L;  // Add 'L' for long

        float decimal = 3.14F;  // Add 'F' for float
        double preciseDecimal = 3.1415926535;

        char letter = 'J';
        boolean isLearningFun = true;

        System.out.println("Byte: " + small);
        System.out.println("Short: " + medium);
        System.out.println("Int: " + large);
        System.out.println("Long: " + veryLarge);
        System.out.println("Float: " + decimal);
        System.out.println("Double: " + preciseDecimal);
        System.out.println("Char: " + letter);
        System.out.println("Boolean: " + isLearningFun);

        // println → This is a method that prints text and moves to a new line.
        // System.out.print() → Prints but stays on the same line.

        // printf
        System.out.print("Hello\nWorld");

        int age = 25;
        double price = 99.99;
        char grade = 'A';
        boolean isPassed = true;

        // Using println
        System.out.println("Hello, World!");

        // Using print
        System.out.print("This is ");
        System.out.print("on the same line.\n");

        // Using printf
        System.out.printf("Age: %d years\n", age);
        System.out.printf("Price: $%.2f\n", price);
        System.out.printf("Grade: %c\n", grade);
        System.out.printf("Passed: %b\n", isPassed);
    }
}

